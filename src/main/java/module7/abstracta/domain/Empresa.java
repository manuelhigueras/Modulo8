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
public class Empresa {
    private Vehiculo[] vehiculo;
    private int tamnoFlota = 0;
    
    public Empresa(){
        this.vehiculo = new Vehiculo[5];
    }

    public int getTamnoFlota() {
        return tamnoFlota;
    }
    
    public Vehiculo[] getVehiculo(){
        return vehiculo;
    }
    
    public Vehiculo getVehiculo(int pos){
        return vehiculo[pos];
    }
    
    public void addVehiculo(Vehiculo v){
        if(this.tamnoFlota < 5){
            this.vehiculo[this.tamnoFlota] = v;
            this.tamnoFlota++;
        }
    }
    
}
