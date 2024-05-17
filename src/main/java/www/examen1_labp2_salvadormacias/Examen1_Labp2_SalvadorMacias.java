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

    public static void listar_enemigos() {
        for (int i = 0; i < lista_enemigo.size(); i++) {
            System.out.println(
                    lista_enemigo.indexOf(lista_enemigo.get(i)) + "-"
                    + lista_enemigo.get(i)
            );
        }

    }//fin listar enemigos

    public static void listar_todos() {
        System.out.println("---lista enemigos---");
        for (int i = 0; i < lista_enemigo.size(); i++) {
            System.out.println(
                    lista_enemigo.indexOf(lista_enemigo.get(i)) + "-"
                    + lista_enemigo.get(i)
            );
        }

        System.out.println("\n\n---lista spidermen---");
        for (int i = 0; i < lista_spidermen.size(); i++) {
            System.out.println(
                    lista_spidermen.indexOf(lista_spidermen.get(i)) + "-"
                    + lista_spidermen.get(i)
            );
        }

    }//fin listar todos

    public static void modificar_spiderman() {
        System.out.println("---modificar spiderman---");
        boolean salida_mod = false;
        do {

            for (int i = 0; i < lista_spidermen.size(); i++) {
                System.out.println(
                        lista_spidermen.indexOf(lista_spidermen.get(i)) + "-"
                        + lista_spidermen.get(i)
                );
            }
            System.out.println("Ingrese el indice del spiderman a modificar: ");
            int indice = lea.nextInt();
            System.out.println("---menu de atributos a modificar---");
            System.out.println("1.nombre");
            System.out.println("2.puntos de vida: ");
            System.out.println("3.puntos de ataque");
            System.out.println("4. nombre del universo");
            System.out.println("5. salir del submenu: ");
            int opc_mod = lea.nextInt();
            switch (opc_mod) {
                case 1: {
                    System.out.println("Ingrese el nuevo nombre del spiderman: ");
                    String nombre = str.nextLine();
                    lista_spidermen.set(indice, nombre);
                    System.out.println("nombre modificado exitosamente...");

                }

                break;
                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;

                default:
                    throw new AssertionError();
            }

        } while (salida_mod != true);
    }

}//fin clase
