/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.exception;

/**
 * Clase AccionDuranteElPatinajeException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class AccionDuranteElPatinajeException extends RuntimeException {
    public AccionDuranteElPatinajeException(){
        super("El vehiculo esta patinando, no podras hacer ninguna accion hasta que el vehiculo se encuentre detenido");
    }
}
