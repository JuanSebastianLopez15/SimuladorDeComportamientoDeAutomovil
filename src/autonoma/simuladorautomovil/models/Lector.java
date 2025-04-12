package autonoma.simuladorautomovil.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interfaz Lector. Define el contrato para las clases que deseen implementar la funcionalidad 
 * de lectura de archivos y retornar su contenido como una lista de líneas de texto.
 * 
 * Esta interfaz puede ser implementada para distintos tipos de lectura: texto plano, JSON, XML, etc.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public interface Lector {

    /**
     * Método encargado de leer un archivo y retornar su contenido como una lista de cadenas de texto.
     * 
     * @param rutaArchivo Ruta del archivo que se desea leer.
     * @return Un {@code ArrayList<String>} con las líneas del archivo.
     * @throws IOException Si ocurre un error durante la lectura del archivo.
     * @since 1.0
     */
    ArrayList<String> leer(String rutaArchivo) throws IOException;
}