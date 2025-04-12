package autonoma.simuladorautomovil.main;

import autonoma.simuladorautomovil.models.Taller;
import autonoma.simuladorautomovil.models.Vehiculo;
import autonoma.simuladorautomovil.exception.ConfiguracionInvalidaException;

public class SimuladorAutomovil {
    public static void main(String[] args) throws ConfiguracionInvalidaException {
        Taller taller = new Taller();
        try {
            Vehiculo auto = taller.configurarVehiculo();
            taller.actualizarConfiguracion(auto);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}