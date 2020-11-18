/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module7.interfacesV2;

/**
 *
 * @author user
 */
public abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk(){
        System.out.println("Camina");
    }
            
    public abstract void eat();
}
