/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen1_labp2_salvadormacias;

/**
 *
 * @author Apple
 */
public abstract class personaje {

    private String nombre;
    private double hp;
    private double hitpoints;
    private String universo;

    public personaje() {
    }

    public personaje(String nombre, double hp, double hitpoints, String universo) {
        this.nombre = nombre;
        this.hp = hp;
        this.hitpoints = hitpoints;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public abstract void ataque();

    @Override
    public String toString() {
        return "personaje{" + "nombre=" + nombre + ", hp=" + hp + ", hitpoints=" + hitpoints + ", universo=" + universo + '}';
    }

}
