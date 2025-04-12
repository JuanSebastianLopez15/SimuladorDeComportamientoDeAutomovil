package autonoma.simuladorautomovil.models;

public class Vehiculo {
    private Motor motor;
    private Llanta llantas;

    public Vehiculo(Motor motor, Llanta llantas) {
        this.motor = motor;
        this.llantas = llantas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setLlantas(Llanta llantas) {
        this.llantas = llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public Llanta getLlantas() {
        return llantas;
    }
}