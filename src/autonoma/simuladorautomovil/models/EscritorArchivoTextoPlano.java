package autonoma.simuladorautomovil.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Clase EscritorArchivoTextoPlano. Implementa la funcionalidad de escribir líneas de texto 
 * en un archivo de texto plano, almacenándolo dentro de una carpeta "config".
 * 
 * Esta clase implementa la interfaz {@link Escritor}.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public class EscritorArchivoTextoPlano implements Escritor {

    /**
     * Método encargado de escribir una lista de líneas de texto en un archivo especificado.
     * Si la carpeta padre del archivo no existe, se crea automáticamente.
     * 
     * @param lineas        Lista de líneas de texto a escribir.
     * @param nombreArchivo Nombre del archivo (relativo a la carpeta "config").
     * @throws IOException  Si ocurre un error durante la escritura del archivo.
     * @since 1.0
     */
    @Override
    public void escribir(ArrayList<String> lineas, String nombreArchivo) throws IOException {
        Path path = Paths.get("config", nombreArchivo);
        Files.createDirectories(path.getParent());
        Files.write(path, lineas);
    }
}