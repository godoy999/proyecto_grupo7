package com.mycompany.progra1grupo42024;


public class Carro extends Vehiculos{
    
    private String Combustible;
    
    public Carro(String Marca, String Color,int ID, String Combustible) {
        super(Marca, Color,ID);
        this.Combustible = Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }
    public String getGasolinaC() {
        return Combustible;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+"" + "\nEl tipo de Gasolina que utiliza es : " +Combustible + "   ";
    }
}
