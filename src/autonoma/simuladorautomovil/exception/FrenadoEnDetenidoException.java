/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.exception;

/**
 * Clase FrenadoEnDetenidoException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class FrenadoEnDetenidoException extends RuntimeException {
    public FrenadoEnDetenidoException(){
        super("El vehiculo no puede frenar porque el vehiculo ya esta detenido");
    }
}
