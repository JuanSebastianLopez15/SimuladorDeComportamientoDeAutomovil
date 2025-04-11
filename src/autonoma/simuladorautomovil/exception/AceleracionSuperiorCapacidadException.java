/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.exception;

/*/**
 * Clase AceleracionSuperiorCapacidadException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class AceleracionSuperiorCapacidadException extends RuntimeException {
    public AceleracionSuperiorCapacidadException (){
        super("Esta aceleranco el vehiculo mas alla de la capacidad de su motor, se accidentara");
    }
}
