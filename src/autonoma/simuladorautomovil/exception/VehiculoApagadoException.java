/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.exception;

/**
 * Clase VehiculoApagadoException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class VehiculoApagadoException extends RuntimeException {
    public VehiculoApagadoException (){
        super("Un vehículo apagado no se puede acelerar o frenar.");
    }
    
}
