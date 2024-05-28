package com.mycompany.progra1grupo42024;


public class Avion extends Vehiculos{
    
   private int PasajerosA;
    
     public Avion(String Marca, String Color,int ID, int PasajerosA) {
        super(Marca, Color,ID);
        this.PasajerosA = PasajerosA;
    }

    public void setPasajerosA(int PasajerosA) {
        this.PasajerosA = PasajerosA;
    }

    public int getPasajerosA() {
        return PasajerosA;
    }
     @Override
    public String toString() {
        return "\n"+super.toString()+"" + "\nLa Cantidad de Personas que puede Transportar un Avion es : " +PasajerosA+"  ";
    }
}
