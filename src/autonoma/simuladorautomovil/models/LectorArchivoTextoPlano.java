package autonoma.simuladorautomovil.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * Clase LectorArchivoTextoPlano. Implementa la interfaz {@link Lector} para permitir la lectura
 * de archivos de texto plano desde el sistema de recursos de la aplicación.
 * Se encarga de leer línea por línea el contenido del archivo ignorando las líneas vacías.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public class LectorArchivoTextoPlano implements Lector {

    /**
     * Lee el contenido de un archivo de texto plano ubicado dentro del sistema de recursos.
     * 
     * @param nombreArchivo Ruta relativa del archivo dentro de los recursos (por ejemplo: "/ruta/archivo.txt").
     * @return Un {@code ArrayList<String>} con cada línea no vacía del archivo.
     * @throws IOException Si el archivo no se encuentra o si ocurre un error durante la lectura.
     * @since 1.0
     */
    @Override
    public ArrayList<String> leer(String nombreArchivo) throws IOException {
        System.out.println("[DEBUG] Buscando: " + nombreArchivo);
        
        InputStream is = getClass().getResourceAsStream(nombreArchivo);
        if (is == null) {
            throw new IOException("No se encontró el archivo en: " + nombreArchivo);
        }

        ArrayList<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8))) {
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lineas.add(linea.trim());
                }
            }
        }
        return lineas;
    }
}