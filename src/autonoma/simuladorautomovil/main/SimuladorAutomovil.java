package autonoma.simuladorautomovil.main;

import autonoma.simuladorautomovil.models.Vehiculo;
import autonoma.simuladorautomovil.views.VentanaPrincipal;
import autonoma.simuladorautomovil.models.Taller;
import autonoma.simuladorautomovil.exception.ConfiguracionInvalidaException;

/**
 * Clase principal SimuladorAutomovil.
 * 
 * Esta clase contiene el método main, punto de entrada de la aplicación.
 * Se encarga de configurar el vehículo desde un archivo y lanzar la interfaz gráfica principal.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public class SimuladorAutomovil {

    /**
     * Método principal que inicializa el simulador de automóvil.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     * @throws ConfiguracionInvalidaException Si la configuración del archivo es inválida.
     * @since 1.0
     */
    public static void main(String[] args) throws ConfiguracionInvalidaException {

        Taller taller = new Taller();
        try {
            Vehiculo auto = taller.configurarVehiculo();
            VentanaPrincipal ventana = new VentanaPrincipal(auto);
            ventana.setVisible(true);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}