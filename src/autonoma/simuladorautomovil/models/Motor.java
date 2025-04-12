
package autonoma.simuladorautomovil.models;

public enum Motor {
    MIL_CC("1000", 100),
    DOSMIL_CC("2000", 160),
    TRESMIL_CC("3000", 220);

    private final String cilindraje;
    private final int velocidadMaxima;
    

    private Motor(String cilindraje, int velocidadMaxima) {
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }

    public static Motor porCilindraje(String cilindraje) {
        for (Motor m : values()) {
            if (m.cilindraje.equalsIgnoreCase(cilindraje)) return m;
        }
        throw new IllegalArgumentException("Cilindraje no válido");
    }

    public String getCilindraje() {
        return cilindraje+" cc";
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
   
}

