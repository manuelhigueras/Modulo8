/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.interfaces;

/**
 *
 * @author user
 */
public class Pajaro implements Volable {

    public void cantar(){
        System.out.println("Pio Pio");
    }
    
    @Override
    public void despegar() {
        System.out.println("Despego como un pajaro");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizo como mis patitas");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo batiendo las alas");
    }
    
}
