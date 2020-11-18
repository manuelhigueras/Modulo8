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
public class Avion extends Vehiculo implements ObjetoVolador{

    String name;

    public Avion(String name, double cargaMaxima) {
        super(cargaMaxima);
        this.name = name;
    }
  
    
    public void despegar(){
        System.out.println("Ha despegado el vuelo XXXXX");
    }
    
    public void aterrizar(){
        System.out.println("Aterrizo el avion");
    }
    
    public void volar(){
        System.out.println("Esta en vuelo");
    }

    @Override
    public double calDistanticaViaje() {
       return 54;
    }

    @Override
    public double calEficienciaConsumo() {
        return 24;
    }
}
