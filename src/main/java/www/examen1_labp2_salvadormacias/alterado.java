/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen1_labp2_salvadormacias;

/**
 *
 * @author Apple
 */
public class alterado extends personaje {

    public alterado() {
    }

    public alterado(String nombre, double hp, double hitpoints, String universo) {
        super(nombre, hp, hitpoints, universo);
    }

    @Override
    public void ataque(double hitpoints) {
        hitpoints*=1.10;
    }

    public String toString() {
        return super.toString() + "alterado{" + '}';
    }
}
