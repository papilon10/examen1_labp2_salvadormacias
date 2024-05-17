/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen1_labp2_salvadormacias;

/**
 *
 * @author Apple
 */
public class alieligena extends personaje {

    public alieligena() {
    }

    public alieligena(String nombre, double hp, double hitpoints, String universo) {
        super(nombre, hp, hitpoints, universo);
    }

    @Override

    public void ataque(double hitpoints) {
        hitpoints *= 1.30;

    }

    public String toString() {
        return super.toString() + "alieligena{" + '}';
    }

}
