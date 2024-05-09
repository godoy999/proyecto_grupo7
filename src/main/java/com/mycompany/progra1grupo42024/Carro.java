
package com.mycompany.progra1grupo42024;

public class Carro extends Vehiculos{
    
    private String GasolinaC;
    
    public Carro(String MarcaV, String ColorV,int Id, String GasolinaC) {
        super(MarcaV, ColorV,Id);
        this.GasolinaC = GasolinaC;
    }
    public String getGasolinaC() {
        return GasolinaC;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+"" + "\nEl tipo de Gasolina que utiliza es : " +GasolinaC + "   ";
    }
}
