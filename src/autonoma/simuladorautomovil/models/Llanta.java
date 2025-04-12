package autonoma.simuladorautomovil.models;

/**
 * Enumeración Llanta. Representa los diferentes tipos de llantas disponibles para un vehículo,
 * cada una con un nombre y un límite de velocidad permitido para frenar bruscamente.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public enum Llanta {

    /**
     * Llantas de tipo "Buenas" con un límite de frenado brusco de 110 km/h.
     */
    BUENAS("Buenas", 110),

    /**
     * Llantas de tipo "Bonitas" con un límite de frenado brusco de 70 km/h.
     */
    BONITAS("Bonitas", 70),

    /**
     * Llantas de tipo "Baratas" con un límite de frenado brusco de 50 km/h.
     */
    BARATAS("Baratas", 50);

    /**
     * Nombre del tipo de llanta.
     */
    private final String nombre;

    /**
     * Límite de velocidad permitido para frenar bruscamente sin riesgo.
     */
    private final int limitePermitido;

    /**
     * Constructor privado de la enumeración Llanta.
     *
     * @param nombre            Nombre de la llanta.
     * @param limitePermitido  Límite de velocidad para frenado brusco.
     */
    private Llanta(String nombre, int limitePermitido) {
        this.nombre = nombre;
        this.limitePermitido = limitePermitido;
    }

    /**
     * Método estático que permite obtener una instancia de Llanta a partir del nombre.
     *
     * @param nombre Nombre de la llanta (ej. "Buenas", "Bonitas", "Baratas").
     * @return Instancia de Llanta correspondiente al nombre.
     * @throws IllegalArgumentException Si el nombre no corresponde a ningún valor definido.
     * @since 1.0
     */
    public static Llanta porNombre(String nombre) {
        for (Llanta l : values()) {
            if (l.nombre.equalsIgnoreCase(nombre)) return l;
        }
        throw new IllegalArgumentException("Tipo de llanta no válido");
    }

    /**
     * Obtiene el nombre de la llanta.
     *
     * @return Nombre de la llanta.
     * @since 1.0
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el límite de velocidad permitido para frenar bruscamente con la llanta.
     *
     * @return Límite de velocidad en km/h.
     * @since 1.0
     */
    public int getLimitePermitido() {
        return limitePermitido;
    }
}