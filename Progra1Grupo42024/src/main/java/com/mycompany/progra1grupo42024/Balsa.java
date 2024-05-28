package com.mycompany.progra1grupo42024;

import java.util.Scanner;

public class Balsa extends Vehiculos{
    
    private String ReMot;

    public Balsa(String ReMot, String Marca,int ID, String Color) {
        super(Marca, Color, ID);
        this.ReMot = ReMot;
    }

    public void setReMot(String ReMot) {
        this.ReMot = ReMot;
    }

    public String getReMot() {
        return ReMot;
    }
    
     @Override
    public String toString() {
        return "\n"+super.toString()+"" + "\nLa Balsa se mueve por : " +ReMot+ "  ";
    }
}
