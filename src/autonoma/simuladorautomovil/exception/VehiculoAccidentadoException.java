/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.exception;

/**
 * Clase VehiculoAccidentadoException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class VehiculoAccidentadoException extends RuntimeException{
    public VehiculoAccidentadoException(){
        super("El vehiculo esta accidentado, este esta apagado y detenido");
    }
}
