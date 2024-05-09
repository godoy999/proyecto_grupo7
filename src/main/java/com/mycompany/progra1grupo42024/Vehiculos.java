
package com.mycompany.progra1grupo42024;


public class Vehiculos {
   protected String MarcaV;
    protected String ColorV;
    protected int Id;

    public Vehiculos(String MarcaV, String ColorV, int Id) {
        this.MarcaV = MarcaV;
        this.ColorV = ColorV;
        this.Id = Id;
    }

    public String getMarcaV() {
        return MarcaV;
    }

    public String getColorV() {
        return ColorV;
    }
    public int getId(){
    return Id;
    }

    @Override
    public String toString() {
        return "\nEl identificador del Vehiculo es:  "+Id +" \nEl color es : " + ColorV + "\nLa marca es: "+ MarcaV;
    }   
}
