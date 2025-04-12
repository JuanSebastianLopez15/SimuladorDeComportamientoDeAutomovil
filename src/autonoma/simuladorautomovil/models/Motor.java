/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.models;

/**
 *
 * @author Asus
 */
public class Motor {
    private float velocidadMaxima;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Motor(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
}
