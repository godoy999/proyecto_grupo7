
package com.mycompany.progra1grupo42024;

import java.util.Scanner;


public class torre {
    public static boolean estado = true;   
public static char resultado;
public static int contador=1;
    // Método para resolver la Torre de Hanoi
    public static void torreDeHanoi(int discos, String torre1, String torre3, String torre2) {
        if (discos == 1) {
            System.out.println("Mover disco 1 de " + torre1 + " --> " + torre3);
            return;
        }
        torreDeHanoi(discos - 1, torre1, torre2, torre3);
        contador++;
        System.out.println("Mover disco " + discos + " de " + torre1 + " --> " + torre3);
        torreDeHanoi(discos - 1, torre2, torre3, torre1);
        contador++;
    }
    
    public static void main(String[] args) {
        
        Torre();
    }
     public static void Torre(){   
        int dato ;
        do{
            System.out.println("\nBienvenido a la torre de Hanoi");  
            
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese la cantidad de discos (minimo 3): ");
        try{
        int discos = entrada.nextInt();
        if(discos < 3){
        estado = true; 
            System.out.println("Por favor ingrese un numero mayor a 3");
        }else{
        // Llamada al método de resolución de la Torre de Hanoi
        String columna1 = "columna 1";
        String columna2 = "columna 2";
        String columna3 = "columna 3";
        
        torreDeHanoi(discos, columna1, columna2, columna3); 
        
        
            System.out.println("Desea salir de la Torre de Hanoi");
            System.out.println("Por favor ingrese 1: para continuar");
            System.out.println("Por favor ingrese 2: para salir");
            System.out.print("Elije una opcion:");
        dato= entrada.nextInt();
        if(dato ==1){
           System.out.println("Ha elejido la opcion para poder seguir ingresando más torres de Hanoi");
            estado = true;
            contador=1;
            
        }else{
            System.out.println("Gracias que tenga un feliz día");
            System.out.println("El juego se realizo en: "+contador+" Movimientos");
            return;
        }
        
        
        }
    }catch(Exception e){ 
            System.out.println("Ha ocurrido una Exception");
            System.out.println("Intetelo de nuevo por favor, gracias");
                
            }
        estado= true;
        
    }while(estado);
    
        }
    
}
