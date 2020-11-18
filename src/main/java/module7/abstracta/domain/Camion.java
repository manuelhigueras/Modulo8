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
public class Camion extends Vehiculo{

    public Camion(double cargaMaxima){
        super(cargaMaxima);
    }
    
    @Override
    public double calDistanticaViaje() {
        System.out.println(". cal distancia del viaje camion");
       return 2.5;
    }

    @Override
    public double calEficienciaConsumo() {
        System.out.println("cal eficiencia consumo camion");
       return 3.5;
    }
    
}
