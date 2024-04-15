package com.mycompany.transportes;

public class VehiculoAereo extends Vehiculo{
    private int numAlas;
     
    public VehiculoAereo(String marca, String modelo, int numAlas){
        super(marca, modelo);
        this.numAlas=numAlas;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Nunmero de Alas: " + numAlas);
    }    
}
