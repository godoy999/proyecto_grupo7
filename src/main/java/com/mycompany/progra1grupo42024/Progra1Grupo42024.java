

package com.mycompany.progra1grupo42024;

import java.util.Scanner;


public class Progra1Grupo42024 {
  public static Scanner a;
    public static Scanner entrada = new Scanner(System.in);
    public static boolean estado = true;
    public static char respuesta;
    public static String combustible;
    public static int pasajeros;

    public static void faseUno() {
        do {

            System.out.println("------------------------------");
            System.out.println("A.Ingresar Datos de Vehiculos");
            System.out.println("B.Mostrar Datos de los Vehiculos ");
            System.out.println("C. Crear una Torre Hanoi ");
            System.out.println("D.Regresar al menu Principal");
            System.out.print("Que Operacion desea:");
            try {
                respuesta = entrada.next().charAt(0);
                char result = Character.toUpperCase(respuesta);
                System.out.println("----------------------------------");
                System.out.println(result);
                switch (result) {
                    case 'A':
                        ingresarCarro();
                        break;
                    case 'B':
                        mostrarDatos();
                        break;
                    case 'C':

                        break;
                    case 'D': //regresamos al menu principal
                        mostrarMenu();
                    default:
                    throw new Exception("Ha ingresado un valor no valido: " + result);
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion ");
                System.out.println("Mensaje: " + e.getMessage());
            }
            System.out.println("Desea regresar al Menu?");
            System.out.println("Si: ingrese (S/s) o cualquier letra para finalizar el proceso.");
            respuesta = entrada.next().charAt(0);

            if (respuesta == 'S' || respuesta == 's') {
                System.out.println();
                estado = true;
            } else {
                estado = false;
            }
        } while (estado);
    }

    public static void ingresarCarro() {
        do {

            System.out.println("------------------------------");
            System.out.println("A: Carro");
            System.out.println("B: Balsa");
            System.out.println("C: Avión");
            System.out.println("D: Desea Regresar al SubMenu");
            System.out.print("Ingrese una opción: ");
            try {
                respuesta = entrada.next().charAt(0);
                char result = Character.toUpperCase(respuesta);
                System.out.println("----------------------------------");
                System.out.println(result);
                switch (result) {
                    case 'A':
                        System.out.println("La clase Carros");
                    case 'B':
                        System.out.println("La balsa");
                    case 'C':
                        System.out.println("El avion");
                    case 'D': //regresamos al menu principal
                        faseUno();
                    default:
                    throw new Exception("Ha ingresado un valor no valido: " + result);
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion");
                System.out.println("Mensaje: " + e.getMessage());
            }
            System.out.println("Desea regresar al sub menu?");
            System.out.println("Si: ingrese (S/s) o cualquier letra para finalizar el proceso.");
            respuesta = entrada.next().charAt(0);

            if (respuesta == 'S' || respuesta == 's') {
                System.out.println();
                estado = true;
            } else {
                estado = false;

            }
        } while (estado);
    }

    public static void mostrarDatos() {

    }

    public static void main(String[] args) {
        mostrarMenu();

    }

    public static void mostrarMenu() {

        do {

            System.out.println("----------------------------------");
            System.out.println("A.Fase 1");
            System.out.println("B.Fase 2");
            System.out.println("C.Fase 3");
            System.out.println("D.Desea Salir del Menu");
            System.out.print("Que opcion desea: ");

            try {
                respuesta = entrada.next().charAt(0);
                char result = Character.toUpperCase(respuesta);
                System.out.println("---------------------------------");
                System.out.println(result);
                switch (result) {
                    case 'A':
                        faseUno();
                    case 'B': // Fase 2
                        break;
                    case 'C':
                        break;
                    case 'D':
                        estado = false;

                        return;

                    default:
                        throw new Exception("Ha ingresado un valor no valido: " + result);
                }

            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion");
                System.out.println("Mensaje: " + e.getMessage());
            }
            System.out.println("Desea regresar al Menu?");
            System.out.println("Si: ingrese (S/s) o cualquier letra para finalizar el proceso.");
            respuesta = entrada.next().charAt(0);

            if (respuesta == 'S' || respuesta == 's') {
                System.out.println();
                estado = true;
            } else {
                estado = false;
            }

        } while (estado);
    } 
   
}