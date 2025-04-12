package autonoma.simuladorautomovil.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class LectorArchivoTextoPlano implements Lector {
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