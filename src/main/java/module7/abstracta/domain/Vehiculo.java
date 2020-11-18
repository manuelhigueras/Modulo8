/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module7.abstracta.domain;

/**
 *
 * @author user
 */
//AHORA ES CLASE BASE PARA OTRAS CALSES HIJAS
//NO PERMITE INSTANCIAR OBJETOS DE TIPOS VEHICULO
//MOTIVO DEL ERROR DEL VEHICULO

public abstract class Vehiculo {
    private double cargaMaxima;

    public Vehiculo(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    
    public double getCargaMaxima(){
        return cargaMaxima;
    }
    
    //METODOS ABSTRACTOS
    public abstract double calDistanticaViaje();
    public abstract double calEficienciaConsumo();
    
}
