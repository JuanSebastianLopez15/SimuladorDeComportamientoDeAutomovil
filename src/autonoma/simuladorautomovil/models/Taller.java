package autonoma.simuladorautomovil.models;

import autonoma.simuladorautomovil.exception.ConfiguracionInvalidaException;
import java.io.IOException;
import java.util.ArrayList;

public class Taller {
    private final Lector lector;
    private final Escritor escritor;
    private static final String ARCHIVO_CONFIG = "/main/resources/autonoma/simuladorautomovil/file/Carro.txt";

    public Taller() {
        this.lector = new LectorArchivoTextoPlano();
        this.escritor = new EscritorArchivoTextoPlano();
    }

    public Vehiculo configurarVehiculo() throws IOException, ConfiguracionInvalidaException {
        ArrayList<String> lineas = lector.leer(ARCHIVO_CONFIG);
        return procesarConfiguracion(lineas);
    }

    private Vehiculo procesarConfiguracion(ArrayList<String> lineas) throws ConfiguracionInvalidaException {
        String lineaLlanta = lineas.get(0);
        String [] infoLineaLlanta = lineaLlanta.split(" ");
        String lineaMotor = lineas.get(1);
        String [] infoLineaMotor = lineaMotor.split(" ");
        String llantas = infoLineaLlanta[1];
        String motor = infoLineaMotor[1];
        if (llantas == null || motor == null) throw new ConfiguracionInvalidaException("Configuración incompleta");
        try {
            return new Vehiculo(Motor.porCilindraje(motor), Llanta.porNombre(llantas));
        } catch (IllegalArgumentException e) {
            throw new ConfiguracionInvalidaException(e.getMessage());
        }
    }

    public void actualizarConfiguracion(Vehiculo vehiculo) throws IOException {
        ArrayList<String> lineas = new ArrayList<>();
        lineas.add("llantas " + vehiculo.getLlantas().getNombre());
        lineas.add("motor " + vehiculo.getMotor().getCilindraje());
        escritor.escribir(lineas, "Carro.txt");
    }
}