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
public class Barcaza extends Vehiculo implements Nautico{
    public Barcaza(double cargaMaxima){
        super(cargaMaxima);
    }
    
    @Override
    public double calDistanticaViaje() {
       System.out.println(". cal distancia del viaje barcaza");
       return 4.5;
    }

    @Override
    public double calEficienciaConsumo() {
       System.out.println("cal eficiencia consumo barcaza");
       return 1.5;
    }

    @Override
    public void atracar() {
        System.out.println("Estoy en la orilla");
    }

    @Override
    public void navegar() {
        System.out.println("Estoy en el mar");
    }
    
}
