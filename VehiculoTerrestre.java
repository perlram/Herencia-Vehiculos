package com.mycompany.transportes;

public class VehiculoTerrestre extends Vehiculo{
    private int numRuedas;
     
    public VehiculoTerrestre(String marca, String modelo, int numRuedas){
        super(marca, modelo);
        this.numRuedas=numRuedas;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Nunmero de ruedas: " + numRuedas);
        }    
}
