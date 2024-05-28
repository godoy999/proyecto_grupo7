package com.mycompany.progra1grupo42024;

public class Vehiculos {
   
   protected String Marca;
    protected String Color;
    protected int ID;

    public Vehiculos(String Marca, String Color, int ID) {
        this.Marca = Marca;
        this.Color = Color;
        this.ID = ID;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarcaV() {
        return Marca;
    }

    public String getColorV() {
        return Color;
    }
    public int getId(){
    return ID;
    }

    @Override
    public String toString() {
        return "\nEl identificador del Vehiculo es:  "+ID +" \nEl color es : " + Color + "\nLa marca es: "+ Marca;
    } 
    
}
