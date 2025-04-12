/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.models;

/**
 *
 * @author Asus
 */
public class Llanta {
    private float limitePermitido;
    private String nombre;

    public Llanta(float limitePermitido) {
        this.limitePermitido = limitePermitido;
    }

    public float getLimitePermitido() {
        return limitePermitido;
    }

    public void setLimitePermitido(float limitePermitido) {
        this.limitePermitido = limitePermitido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
