package autonoma.simuladorautomovil.models;

import java.io.IOException;
import java.util.ArrayList;

public interface Lector {
    ArrayList<String> leer(String rutaArchivo) throws IOException;
}