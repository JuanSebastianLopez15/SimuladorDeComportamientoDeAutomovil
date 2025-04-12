package autonoma.simuladorautomovil.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EscritorArchivoTextoPlano implements Escritor {
    @Override
    public void escribir(ArrayList<String> lineas, String nombreArchivo) throws IOException {
        Path path = Paths.get("config", nombreArchivo);
        Files.createDirectories(path.getParent());
        Files.write(path, lineas);
    }
}