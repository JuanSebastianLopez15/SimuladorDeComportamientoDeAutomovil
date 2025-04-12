package autonoma.simuladorautomovil.models;

/**
 * Enumeración Motor. Representa los diferentes tipos de motores disponibles para un vehículo,
 * definidos por su cilindraje y su velocidad máxima asociada.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public enum Motor {

    /**
     * Motor de 1000 cc con velocidad máxima de 100 km/h.
     */
    MIL_CC("1000", 100),

    /**
     * Motor de 2000 cc con velocidad máxima de 160 km/h.
     */
    DOSMIL_CC("2000", 160),

    /**
     * Motor de 3000 cc con velocidad máxima de 220 km/h.
     */
    TRESMIL_CC("3000", 220);

    /**
     * Cilindraje del motor en formato String (ej. "1000").
     */
    private final String cilindraje;

    /**
     * Velocidad máxima permitida por el motor.
     */
    private final int velocidadMaxima;

    /**
     * Constructor privado de la enumeración Motor.
     *
     * @param cilindraje       Cilindraje del motor.
     * @param velocidadMaxima  Velocidad máxima del motor.
     */
    private Motor(String cilindraje, int velocidadMaxima) {
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Método estático que permite obtener una instancia de Motor a partir del cilindraje.
     *
     * @param cilindraje Cilindraje en formato String (ej. "1000").
     * @return Instancia de Motor correspondiente al cilindraje.
     * @throws IllegalArgumentException Si el cilindraje no corresponde a ningún valor definido.
     * @since 1.0
     */
    public static Motor porCilindraje(String cilindraje) {
        for (Motor m : values()) {
            if (m.cilindraje.equalsIgnoreCase(cilindraje)) return m;
        }
        throw new IllegalArgumentException("Cilindraje no válido");
    }

    /**
     * Obtiene el cilindraje del motor seguido de la unidad "cc".
     *
     * @return String con el cilindraje del motor (ej. "1000 cc").
     * @since 1.0
     */
    public String getCilindraje() {
        return cilindraje + " cc";
    }

    /**
     * Obtiene la velocidad máxima que puede alcanzar el motor.
     *
     * @return Velocidad máxima en km/h.
     * @since 1.0
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}