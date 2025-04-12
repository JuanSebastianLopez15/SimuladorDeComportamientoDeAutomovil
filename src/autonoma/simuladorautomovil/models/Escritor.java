package autonoma.simuladorautomovil.models;

import java.io.IOException;
import java.util.ArrayList;

public interface Escritor {
    void escribir(ArrayList<String> lineas, String rutaArchivo) throws IOException;
}