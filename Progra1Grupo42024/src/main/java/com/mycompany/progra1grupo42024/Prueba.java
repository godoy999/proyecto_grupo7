
package com.mycompany.progra1grupo42024;

import java.util.Scanner;


public class Prueba {
    public static Scanner entrada = new Scanner(System.in);
   public static void main(String[] args) {
       int ID;
       String MarcaV, ColorV,  GasolinaC;
        Tabla datos = new Tabla();
        System.out.println("Ingrese un Id");
        ID = entrada.nextInt();
        System.out.println("Ingrese La Marca: ");
        MarcaV = entrada.nextLine();
        System.out.println("Ingrese el Color: ");
        ColorV= entrada.nextLine();
        System.out.println("Tipo de combustible: ");
        GasolinaC = entrada.nextLine();
        datos.AguardarCarro(ID,MarcaV,ColorV,GasolinaC);
    }
    
}
