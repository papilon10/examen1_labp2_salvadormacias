/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen1_labp2_salvadormacias;

/**
 *
 * @author Apple
 */
public class personaje {

    private String nombre;
    private int hp;
    private String universo;

    public personaje() {
    }

    public personaje(String nombre, int hp, String universo) {
        this.nombre = nombre;
        this.hp = hp;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public void ataque() {

    }

    @Override
    public String toString() {
        return "personaje{" + "nombre=" + nombre + ", hp=" + hp + ", universo=" + universo + '}';
    }

}
