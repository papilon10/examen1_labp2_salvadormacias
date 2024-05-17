/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen1_labp2_salvadormacias;

import java.util.Random;

/**
 *
 * @author Apple
 */
public class superior extends personaje {

    public superior() {
    }

    public superior(String nombre, double hp, double hitpoints, String universo) {
        super(nombre, hp, hitpoints, universo);
    }

    @Override
    public void ataque(double hitpoints) {
        Random random = new Random();
        int aleatorio = random.nextInt((int) 0.2) + 1;
        hitpoints *= aleatorio;
    }

    public String toString() {
        return super.toString() + "superior{" + '}';
    }

}
