package autonoma.simuladorautomovil.models;

import autonoma.simuladorautomovil.exception.ApagadoVelocidadAltaException;
import autonoma.simuladorautomovil.exception.FrenadoBruscoLlantasException;
import autonoma.simuladorautomovil.exception.FrenadoEnDetenidoException;
import autonoma.simuladorautomovil.exception.FrenadoIntensidadInvalidaException;
import autonoma.simuladorautomovil.exception.VehiculoApagadoException;
import autonoma.simuladorautomovil.exception.VehiculoYaApagadoException;
import autonoma.simuladorautomovil.exception.VehiculoYaEncendidoException;

/**
 * Clase Vehiculo. Encargada de simular el comportamiento básico de un vehículo con motor y llantas.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public class Vehiculo {

    /**
     * Almacena la velocidad actual del vehículo.
     */
    private float velocidadActual;

    /**
     * Indica si el vehículo está encendido o apagado.
     */
    private boolean vehiculoEncendido;

    /**
     * Instancia de la clase Llanta asociada al vehículo.
     */
    private Llanta llanta;

    /**
     * Instancia de la clase Motor asociada al vehículo.
     */
    private Motor motor;

    /**
     * Constructor de la clase Vehiculo.
     * Inicializa la velocidad en 0 y el estado como apagado.
     * 
     * @param motor  El motor del vehículo.
     * @param llanta Las llantas del vehículo.
     * @since 1.0
     */
    public Vehiculo(Motor motor, Llanta llanta) {
        this.velocidadActual = 0;
        this.vehiculoEncendido = false;
        this.llanta = llanta;
        this.motor = motor;
    }

    /**
     * Método para encender el vehículo.
     * 
     * @throws VehiculoYaEncendidoException Si el vehículo ya se encuentra encendido.
     * @since 1.0
     */
    public void encender() {
        if (vehiculoEncendido) {
            throw new VehiculoYaEncendidoException();
        }
        vehiculoEncendido = true;
    }

    /**
     * Método para apagar el vehículo.
     * 
     * @throws VehiculoYaApagadoException        Si el vehículo ya se encuentra apagado.
     * @throws ApagadoVelocidadAltaException     Si se intenta apagar el vehículo con una velocidad mayor a 60.
     * @since 1.0
     */
    public void apagar() throws ApagadoVelocidadAltaException, VehiculoYaApagadoException {
        if (!vehiculoEncendido) {
            throw new VehiculoYaApagadoException();
        }
        if (velocidadActual > 60) {
            vehiculoEncendido = false;
            velocidadActual = 0;
            throw new ApagadoVelocidadAltaException();
        }
        vehiculoEncendido = false;
    }

    /**
     * Método para acelerar el vehículo.
     * 
     * @param incrementoVelocidad La cantidad de velocidad a incrementar.
     * @return La nueva velocidad después de acelerar.
     * @throws VehiculoApagadoException Si se intenta acelerar con el vehículo apagado.
     * @since 1.0
     */
    public float acelerar(float incrementoVelocidad) throws VehiculoApagadoException {
        if (!vehiculoEncendido) {
            throw new VehiculoApagadoException();
        }
        velocidadActual += incrementoVelocidad;
        return velocidadActual;
    }

    /**
     * Método para frenar el vehículo.
     * 
     * @param decrementoVelocidad La cantidad de velocidad a reducir.
     * @return La nueva velocidad después del frenado.
     * @throws VehiculoApagadoException            Si el vehículo está apagado.
     * @throws FrenadoEnDetenidoException          Si se intenta frenar estando detenido.
     * @throws FrenadoIntensidadInvalidaException  Si el frenado excede la velocidad actual.
     * @since 1.0
     */
    public float frenar(float decrementoVelocidad) throws VehiculoApagadoException, FrenadoEnDetenidoException, FrenadoIntensidadInvalidaException {
        if (!vehiculoEncendido) {
            throw new VehiculoApagadoException();
        }
        if (velocidadActual == 0) {
            throw new FrenadoEnDetenidoException();
        }
        if (decrementoVelocidad > velocidadActual) {
            throw new FrenadoIntensidadInvalidaException();
        }
        velocidadActual -= decrementoVelocidad;
        if (velocidadActual < 0){
            velocidadActual = 0;
        }
        return velocidadActual;
    }

    /**
     * Método para frenar bruscamente el vehículo.
     * 
     * @return La nueva velocidad (0) tras frenar bruscamente.
     * @throws FrenadoBruscoLlantasException Si se frena bruscamente superando el límite permitido por las llantas.
     * @throws FrenadoEnDetenidoException    Si se intenta frenar bruscamente estando detenido.
     * @since 1.0
     */
    public float frenarBruscamente() throws FrenadoBruscoLlantasException, FrenadoEnDetenidoException {
        if (velocidadActual == 0) {
            throw new FrenadoEnDetenidoException();
        }
        if (velocidadActual > llanta.getLimitePermitido()) {
            velocidadActual = 0;
            throw new FrenadoBruscoLlantasException();
        } else {
            velocidadActual = 0;
        }
        return velocidadActual;
    }

    /**
     * Método getter para la velocidad actual.
     * 
     * @return La velocidad actual del vehículo.
     * @since 1.0
     */
    public float getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * Método setter para la velocidad actual.
     * 
     * @param velocidadActual La nueva velocidad del vehículo.
     * @since 1.0
     */
    public void setVelocidadActual(float velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * Método getter para saber si el vehículo está encendido.
     * 
     * @return true si está encendido, false si no.
     * @since 1.0
     */
    public boolean getVehiculoEncendido() {
        return vehiculoEncendido;
    }

    /**
     * Método setter para el estado encendido del vehículo.
     * 
     * @param vehiculoEncendido Valor booleano para encender o apagar el vehículo.
     * @since 1.0
     */
    public void setVehiculoEncendido(boolean vehiculoEncendido) {
        this.vehiculoEncendido = vehiculoEncendido;
    }

    /**
     * Método getter para la llanta del vehículo.
     * 
     * @return La instancia de la llanta del vehículo.
     * @since 1.0
     */
    public Llanta getLlanta() {
        return llanta;
    }

    /**
     * Método setter para asignar una nueva llanta al vehículo.
     * 
     * @param llanta La nueva llanta a asignar.
     * @since 1.0
     */
    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    /**
     * Método getter para el motor del vehículo.
     * 
     * @return La instancia del motor del vehículo.
     * @since 1.0
     */
    public Motor getMotor() {
        return motor;
    }
}