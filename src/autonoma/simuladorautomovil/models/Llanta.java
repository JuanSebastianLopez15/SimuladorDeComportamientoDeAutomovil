package autonoma.simuladorautomovil.models;

public enum Llanta {
    BUENAS("Buenas", 110),
    BONITAS("Bonitas", 70),
    BARATAS("Baratas", 50);

    private final String nombre;
    private final int limitePermitido;

    private Llanta(String nombre, int limitePermitido) {
        this.nombre = nombre;
        this.limitePermitido = limitePermitido;
    }

    public static Llanta porNombre(String nombre) {
        for (Llanta l : values()) {
            if (l.nombre.equalsIgnoreCase(nombre)) return l;
        }
        throw new IllegalArgumentException("Tipo de llanta no válido");
    }

    public String getNombre() {
        return nombre;
    }

    public int getLimitePermitido() {
        return limitePermitido;
    }
}