
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.main;

import autonoma.simuladorautomovil.models.Vehiculo;
import autonoma.simuladorautomovil.views.VentanaPrincipal;
import autonoma.simuladorautomovil.models.Taller;
import autonoma.simuladorautomovil.exception.ConfiguracionInvalidaException;

/**
 *
 * @author Asus
 */
public class SimuladorAutomovil {
    public static void main(String[] args)throws ConfiguracionInvalidaException {
        
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

