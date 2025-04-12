/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.main;

import autonoma.simuladorautomovil.models.Vehiculo;
import autonoma.simuladorautomovil.views.VentanaPrincipal;

/**
 *
 * @author Asus
 */
public class SimuladorAutomovil {
    public static void main(String[] args) {
        Vehiculo carro=new Vehiculo();
        VentanaPrincipal ventana = new VentanaPrincipal(carro);
        ventana.setVisible(true);
    }
}
