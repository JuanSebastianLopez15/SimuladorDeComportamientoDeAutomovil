package autonoma.simuladorautomovil.exception;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase FrenadoIntensidadInvalidaException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class FrenadoIntensidadInvalidaException extends RuntimeException {
    public FrenadoIntensidadInvalidaException (){
        super("El vehiculo frena con una intensidad mayor a la de su velocidad actual, el vehiculo patinara");
    }
}
