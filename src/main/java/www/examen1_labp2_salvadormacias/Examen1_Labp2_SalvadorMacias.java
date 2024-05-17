/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package www.examen1_labp2_salvadormacias;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
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
        System.out.println("---menu principal---");
        boolean salida = false;
        do {
            System.out.println("1. agregar spiderman");
            System.out.println("2. agregar enemigo");
            System.out.println("3. listar enemigos");
            System.out.println("4. listar todos");
            System.out.println("5. modificar spiderman");
            System.out.println("6. modificar enemigo");
            System.out.println("7. eliminar spiderman");
            System.out.println("8. eliminar enemigo");
            System.out.println("9. jugar");
            System.out.println("10. salir");
            int opc = lea.nextInt();
            switch (opc) {
                case 1: {
                    agregar_spiderman();
                }

                break;
                case 2: {
                    agregar_enemigo();

                }
                break;
                case 3: {
                    listar_enemigos();

                }
                break;
                case 4: {
                    listar_todos();

                }
                break;
                case 5: {
                    modificar_spiderman(lista_spidermen);

                }
                break;
                case 6: {
                    modificar_enemigo(lista_enemigo);

                }
                break;
                case 7: {
                    eliminar_spiderman();

                }
                break;
                case 8: {
                    eliminar_enemigo();

                }
                break;
                case 9: {
                    jugar(lista_enemigo,lista_spidermen);
                }
                break;

                case 10: {
                    salida = true;
                    System.out.println("se abandonara el programa...");
                }
                break;
                default:
                    System.out.println("opcion ingresada es invalida...");
            }

        } while (salida != true);

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
                    Random random = new Random();
                    int aleatorio = random.nextInt(401) + 200;
                    double hp = aleatorio;
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = str.nextLine();
                    lista_spidermen.add(new clasico(nombre, hp, hitpoints, universo));
                    System.out.println("spiderman creado exitosamente...");

                }
                break;
                case 2: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    Random random = new Random();
                    int aleatorio = random.nextInt(401) + 200;
                    double hp = aleatorio;
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = str.nextLine();
                    lista_spidermen.add(new spiderpunk(nombre, hp, hitpoints, universo));
                    System.out.println("spiderman creado exitosamente...");

                }
                break;
                case 3: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    Random random = new Random();
                    int aleatorio = random.nextInt(401) + 200;
                    double hp = aleatorio;
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = str.nextLine();
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

        clasico juan = new clasico("juan", 9000, 450, "ultimate");
        spiderpunk ramiro = new spiderpunk("ramiro", 944, 260, "616");
        superior goku = new superior("goku", 440, 440, "ultimate");

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
                    Random random = new Random();
                    int aleatorio = random.nextInt(401) + 200;
                    double hp = aleatorio;
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = str.nextLine();
                    lista_enemigo.add(new alieligena(nombre, hp, hitpoints, universo));
                    System.out.println("enemigo creado exitosamente...");
                }

                break;
                case 2: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    Random random = new Random();
                    int aleatorio = random.nextInt(401) + 200;
                    double hp = aleatorio;
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = str.nextLine();
                    lista_enemigo.add(new alterado(nombre, hp, hitpoints, universo));
                    System.out.println("enemigo creado exitosamente...");

                }
                break;
                case 3: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    Random random = new Random();
                    int aleatorio = random.nextInt(401) + 200;
                    double hp = aleatorio;
                    System.out.println("Ingrese los puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    System.out.println("Ingrese el nombre del universo: ");
                    String universo = str.nextLine();
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

    public static void modificar_spiderman(ArrayList<personaje> lista_spidermen) {
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
            System.out.println("2.puntos de ataque");
            System.out.println("3. nombre del universo");
            System.out.println("4. salir del submenu: ");
            int opc_mod = lea.nextInt();
            switch (opc_mod) {
                case 1: {
                    System.out.println("Ingrese el nuevo nombre del spiderman: ");
                    String nombre = str.nextLine();
                    lista_spidermen.get(indice).setNombre(nombre);
                    System.out.println("nombre modificado exitosamente...");

                }

                break;
                case 2: {
                    System.out.println("Ingrese el los nuevos puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    lista_spidermen.get(indice).setHitpoints(hitpoints);
                    System.out.println("puntos de ataque modificado exitosamente...");

                }
                break;
                case 3: {
                    System.out.println("Ingrese el nuevo nombre del universo: ");
                    String universo = str.nextLine();
                    lista_spidermen.get(indice).setUniverso(universo);
                    System.out.println("nombre de universo modicado exitosamente...");

                }
                break;
                case 4: {
                    salida_mod = true;
                    System.out.println("se saldra del submenu...");

                }
                break;

                default:
                    System.out.println("opcion ingresada es invalida...");
            }

        } while (salida_mod != true);
    }// fin modificar spiderman

    public static void modificar_enemigo(ArrayList<personaje> lista_enemigo) {
        System.out.println("---modificar enemigo---");
        boolean salida_mod_enemigo = false;
        do {

            for (int i = 0; i < lista_enemigo.size(); i++) {
                System.out.println(
                        lista_enemigo.indexOf(lista_enemigo.get(i)) + "-"
                        + lista_enemigo.get(i)
                );
            }
            System.out.println("Ingrese el indice del enemigo a modificar: ");
            int indice = lea.nextInt();
            System.out.println("---menu de atributos a modificar---");
            System.out.println("1.nombre");
            System.out.println("2.puntos de ataque");
            System.out.println("3. nombre del universo");
            System.out.println("4. salir del submenu: ");
            int opc_mod_enemigo = lea.nextInt();
            switch (opc_mod_enemigo) {
                case 1: {
                    System.out.println("Ingrese el nuevo nombre del spiderman: ");
                    String nombre = str.nextLine();
                    lista_enemigo.get(indice).setNombre(nombre);
                    System.out.println("nombre modificado exitosamente...");

                }

                break;
                case 2: {
                    System.out.println("Ingrese el los nuevos puntos de ataque: ");
                    double hitpoints = lea.nextDouble();
                    lista_enemigo.get(indice).setHitpoints(hitpoints);
                    System.out.println("puntos de ataque modificado exitosamente...");

                }
                break;
                case 3: {
                    System.out.println("Ingrese el nuevo nombre del universo: ");
                    String universo = str.nextLine();
                    lista_enemigo.get(indice).setUniverso(universo);
                    System.out.println("nombre de universo modicado exitosamente...");

                }
                break;
                case 4: {
                    salida_mod_enemigo = true;
                    System.out.println("se saldra del submenu...");

                }
                break;

                default:
                    System.out.println("opcion ingresada es invalida...");
            }

        } while (salida_mod_enemigo != true);
    }//fin mod enemigo

    public static void eliminar_spiderman() {
        for (int i = 0; i < lista_spidermen.size(); i++) {
            System.out.println(
                    lista_spidermen.indexOf(lista_spidermen.get(i)) + "-"
                    + lista_spidermen.get(i)
            );
        }
        System.out.println("Ingrese el indice del enemigo a eliminar: ");
        int indice = lea.nextInt();
        lista_spidermen.remove(indice);
        System.out.println("el spiderman fue eliminado exitosamente...");

    }//fin eliminar spiderman

    public static void eliminar_enemigo() {
        for (int i = 0; i < lista_enemigo.size(); i++) {
            System.out.println(
                    lista_enemigo.indexOf(lista_enemigo.get(i)) + "-"
                    + lista_enemigo.get(i)
            );
        }
        System.out.println("Ingrese el indice del enemigo a eliminar: ");
        int indice = lea.nextInt();
        lista_enemigo.remove(indice);
        System.out.println("el enemigo fue eliminado exitosamente...");

    }//fin eliminar enemigo

    public static void jugar(ArrayList<personaje> lista_spidermen, ArrayList<personaje> lista_enemigo) {
       /* if (lista_enemigo.size() == lista_enemigo.size()) {
            Collections.shuffle(lista_enemigo);
            Collections.shuffle(lista_spidermen);
            for (personaje object : lista_enemigo) {
                double x = lista_enemigo.get(lista_enemigo.get(object)).getHitpoints();
                double y = lista_spidermen.get(0).getHp();
                double vida_x = x - y;
            }
            for (personaje object : lista_enemigo) {
                double x = lista_enemigo.get(lista_enemigo.get(object)).getHitpoints();
                double y = lista_spidermen.get(0).getHp();
                double vida_y = y - x;
            }

        } else {

            System.out.println("las listas deben tener la misma cantidad de personajes");
        }*/

    }

}//fin clase
