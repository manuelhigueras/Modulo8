/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.interfaces;

import module7.abstracta.domain.Vehiculo;

/**
 *
 * @author user
 */
public class Avion extends Vehiculo implements Volable{

    public Avion(double cargaMaxima) {
        super(cargaMaxima);
    }

    @Override
    public double calDistanticaViaje() {
        System.out.println("Calculo distnaica de viaje Avion");
        return 34.8;
    }

    @Override
    public double calEficienciaConsumo() {
        System.out.println("Calculo eficiencia consumo fuel Avion");
        return 142;
    }

    @Override
    public void despegar() {
        System.out.println("Despego el avion");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizo como un avion");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo como un avion");
    }
    
}
