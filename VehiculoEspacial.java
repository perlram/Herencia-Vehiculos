package com.mycompany.transportes;

public class VehiculoEspacial extends Vehiculo{
    private String TipoRemolcador;
     
    public VehiculoEspacial(String marca, String modelo, String TipoRemolcador){
        super(marca, modelo);
        this.TipoRemolcador=TipoRemolcador;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de Remolcador: " + TipoRemolcador);
    }       
}
