package com.mycompany.progra1grupo42024;


public class Avion extends Vehiculos{
    
   private int PasajerosA;
    
     public Avion(String MarcaV, String ColorV,int Id, int PasajerosA) {
        super(MarcaV, ColorV,Id);
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
