/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package www.examen1_labp2_salvadormacias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Examen1_Labp2_SalvadorMacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static ArrayList lista_spidermen = new ArrayList();
    public static ArrayList lista_enemigo = new ArrayList();

    public static void main(String[] args) {

    }//fin main

    public static void agregar_spiderman() {
        System.out.println("---agregar spiderman---");
        boolean menu_agg = false;
        do {
            System.out.println("1. agregar clasico");
            System.out.println("2. agregar spiderpunk");
            System.out.println("3. agregar superior");
            System.out.println("4. salir del submenu");
            int opc_agg = lea.nextInt();
            switch (opc_agg) {
                case 1: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    System.out.println("Ingrese los puntos de vida: ");
                    double hp = lea.nextDouble();
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = lea.nextLine();
                    lista_spidermen.add(new clasico(nombre, hp, hitpoints, universo));
                    System.out.println("spiderman creado exitosamente...");

                }
                break;
                case 2: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    System.out.println("Ingrese los puntos de vida: ");
                    double hp = lea.nextDouble();
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = lea.nextLine();
                    lista_spidermen.add(new spiderpunk(nombre, hp, hitpoints, universo));
                    System.out.println("spiderman creado exitosamente...");

                }
                break;
                case 3: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    System.out.println("Ingrese los puntos de vida: ");
                    double hp = lea.nextDouble();
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = lea.nextLine();
                    lista_spidermen.add(new superior(nombre, hp, hitpoints, universo));
                    System.out.println("spiderman creado exitosamente...");

                }
                break;
                case 4: {
                    menu_agg = true;
                    System.out.println("se abandonara el menu...");

                }
                break;
                default:
                    System.out.println("opcion ingresada es invalida...");
            }

        } while (menu_agg != true);

    }//fin agregar spiderman

    public static void agregar_enemigo() {
        System.out.println("---agregar enemigo---");
        boolean menu_agg_enemigo = false;
        do {
            System.out.println("1. agregar alieligena");
            System.out.println("2. agregar alterado");
            System.out.println("3. agregar blindado");
            System.out.println("4. salir del submenu");
            int opc_agg_enemigo = lea.nextInt();
            switch (opc_agg_enemigo) {
                case 1: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    System.out.println("Ingrese los puntos de vida: ");
                    double hp = lea.nextDouble();
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = lea.nextLine();
                    lista_enemigo.add(new alieligena(nombre, hp, hitpoints, universo));
                    System.out.println("enemigo creado exitosamente...");
                }

                break;
                case 2: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    System.out.println("Ingrese los puntos de vida: ");
                    double hp = lea.nextDouble();
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = lea.nextLine();
                    lista_enemigo.add(new alterado(nombre, hp, hitpoints, universo));
                    System.out.println("enemigo creado exitosamente...");

                }
                break;
                case 3: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    System.out.println("Ingrese los puntos de vida: ");
                    double hp = lea.nextDouble();
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = lea.nextLine();
                    lista_enemigo.add(new blindado(nombre, hp, hitpoints, universo));
                    System.out.println("enemigo creado exitosamente...");

                }
                break;
                case 4: {
                    menu_agg_enemigo = true;
                    System.out.println("se abandonara el submenu...");

                }
                break;
                default:
                    System.out.println("opcion ingresada es invalida...");
            }

        } while (menu_agg_enemigo != true);

    }//fin agregar enemigo

}//fin clase
