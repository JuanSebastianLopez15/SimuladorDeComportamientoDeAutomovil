package autonoma.simuladorautomovil.models;

import autonoma.simuladorautomovil.exception.ConfiguracionInvalidaException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase Taller. Encargada de leer, procesar y actualizar la configuración de un vehículo 
 * a partir de un archivo de texto plano.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public class Taller {

    /**
     * Objeto encargado de la lectura del archivo de configuración.
     */
    private Lector lector;

    /**
     * Objeto encargado de la escritura del archivo de configuración.
     */
    private Escritor escritor;

    /**
     * Ruta del archivo de configuración del vehículo.
     */
    private static final String ARCHIVO_CONFIG = "/main/resources/autonoma/simuladorautomovil/file/Carro.txt";

    /**
     * Constructor de la clase Taller.
     * Inicializa los objetos lector y escritor con sus respectivas implementaciones.
     * 
     * @since 1.0
     */
    public Taller() {
        this.lector = new LectorArchivoTextoPlano();
        this.escritor = new EscritorArchivoTextoPlano();
    }

    /**
     * Método encargado de configurar un vehículo a partir del archivo de configuración.
     * 
     * @return Instancia del vehículo configurado.
     * @throws IOException                    Si ocurre un error durante la lectura del archivo.
     * @throws ConfiguracionInvalidaException Si el archivo contiene información inválida o incompleta.
     * @since 1.0
     */
    public Vehiculo configurarVehiculo() throws IOException, ConfiguracionInvalidaException {
        ArrayList<String> lineas = lector.leer(ARCHIVO_CONFIG);
        return procesarConfiguracion(lineas);
    }

    /**
     * Método privado encargado de procesar la configuración leída desde el archivo.
     * 
     * @param lineas Líneas leídas del archivo de configuración.
     * @return Instancia del vehículo con las configuraciones cargadas.
     * @throws ConfiguracionInvalidaException Si los datos no son válidos o están incompletos.
     * @since 1.0
     */
    private Vehiculo procesarConfiguracion(ArrayList<String> lineas) throws ConfiguracionInvalidaException {
        String lineaLlanta = lineas.get(0);
        String[] infoLineaLlanta = lineaLlanta.split(" ");
        String lineaMotor = lineas.get(1);
        String[] infoLineaMotor = lineaMotor.split(" ");
        String llantas = infoLineaLlanta[1];
        String motor = infoLineaMotor[1];

        if (llantas == null || motor == null) throw new ConfiguracionInvalidaException("Configuración incompleta");

        try {
            return new Vehiculo(Motor.porCilindraje(motor), Llanta.porNombre(llantas));
        } catch (IllegalArgumentException e) {
            throw new ConfiguracionInvalidaException(e.getMessage());
        }
    }

    /**
     * Método encargado de actualizar el archivo de configuración con la información del vehículo actual.
     * 
     * @param vehiculo Vehículo cuya configuración se desea guardar.
     * @throws IOException Si ocurre un error durante la escritura del archivo.
     * @since 1.0
     */
    public void actualizarConfiguracion(Vehiculo vehiculo) throws IOException {
        ArrayList<String> lineas = new ArrayList<>();
        lineas.add("llantas " + vehiculo.getLlanta().getNombre());
        lineas.add("motor " + vehiculo.getMotor().getCilindraje());
        escritor.escribir(lineas, "/main/resources/autonoma/simuladorautomovil/file/Carro.txt");
    }
}