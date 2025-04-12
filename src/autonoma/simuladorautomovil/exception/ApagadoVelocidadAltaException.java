/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.exception;

/**
 * Clase ApagadoVelocidadAltaException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class ApagadoVelocidadAltaException extends RuntimeException {
    public ApagadoVelocidadAltaException(){
        super("Usted apago el vehiculo y la velocidad es superior a los 60 Km/h, se accidentara");
    }
    
}
