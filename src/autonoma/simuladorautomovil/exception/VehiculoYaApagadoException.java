/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.exception;

/**
 * Clase VehiculoYaApagadoException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class VehiculoYaApagadoException extends RuntimeException{
    public VehiculoYaApagadoException (){
        super("Un vehículo apagado no se puede apagar de nuevo.");
    }
}
