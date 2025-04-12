package autonoma.simuladorautomovil.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interfaz Escritor. Define el contrato para escribir líneas de texto en un archivo.
 * 
 * Esta interfaz puede ser implementada por diferentes clases que manejen persistencia en archivos.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public interface Escritor {

    /**
     * Método para escribir líneas de texto en un archivo.
     *
     * @param lineas       Lista de cadenas de texto que se desean escribir.
     * @param rutaArchivo  Ruta del archivo donde se escribirá la información.
     * @throws IOException Si ocurre un error durante la escritura del archivo.
     * @since 1.0
     */
    void escribir(ArrayList<String> lineas, String rutaArchivo) throws IOException;
}