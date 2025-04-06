/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.exception;

/**
 * Clase FrenadoBruscoLlantasException. Hereda de la clase RuntimeException
 * 
 * @author  Juan Sebastian Lopez G.
 * @version 06042025
 * @since   1.0
 */
public class FrenadoBruscoLlantasException extends RuntimeException{
    public FrenadoBruscoLlantasException (){
        super("Freno buscamente el vehiculo cuando este superaba el limite permitido por sus llantas, el vehiculo patinara");
    }
}
