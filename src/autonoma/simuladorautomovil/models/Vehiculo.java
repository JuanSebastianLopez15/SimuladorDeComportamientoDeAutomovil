
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.models;

import autonoma.simuladorautomovil.exception.ApagadoVelocidadAltaException;
import autonoma.simuladorautomovil.exception.FrenadoBruscoLlantasException;
import autonoma.simuladorautomovil.exception.FrenadoEnDetenidoException;
import autonoma.simuladorautomovil.exception.FrenadoIntensidadInvalidaException;
import autonoma.simuladorautomovil.exception.VehiculoApagadoException;
import autonoma.simuladorautomovil.exception.VehiculoYaApagadoException;
import autonoma.simuladorautomovil.exception.VehiculoYaEncendidoException;

/**
 *
 * @author Asus
 */
public class Vehiculo {
    
    private float velocidadActual;
    private boolean vehiculoEncendido;
    private Llanta llanta;
    private Motor motor;

    public Vehiculo() {
        this.velocidadActual = 0;
        this.vehiculoEncendido = false;
    }
    public void encender() {
        if (vehiculoEncendido) {
            throw new VehiculoYaEncendidoException(); 
        }
        vehiculoEncendido = true;
    }
    public void apagar(){
        if (!vehiculoEncendido) {
            throw new VehiculoYaApagadoException();
        }
        if (velocidadActual > 60) {
            vehiculoEncendido = false;
            throw new ApagadoVelocidadAltaException();
        }
        vehiculoEncendido = false;
    }
    public float acelerar(float incrementoVelocidad){
        if (!vehiculoEncendido) {
            throw new VehiculoApagadoException();
        }
        velocidadActual += incrementoVelocidad;
        return velocidadActual;
    }
    public float frenar(float decrementoVelocidad){
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
    public float frenarBruscamente(){
        if (velocidadActual > 0) {
            velocidadActual = 0;
            throw new FrenadoBruscoLlantasException();
        }
        return velocidadActual;
    }
    //Setters y getters
    public float getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(float velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean getVehiculoEncendido() {
        return vehiculoEncendido;
    }

    public void setVehiculoEncendido(boolean vehiculoEncendido) {
        this.vehiculoEncendido = vehiculoEncendido;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public Motor getMotor() {
        return motor;
    }
}


