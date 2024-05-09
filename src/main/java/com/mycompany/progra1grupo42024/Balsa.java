
package com.mycompany.progra1grupo42024;


public class Balsa extends Vehiculos{
    
    private String ReMot;

    public Balsa(String ReMot, String MarcaV,int Id, String ColorV) {
        super(MarcaV, ColorV, Id);
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
