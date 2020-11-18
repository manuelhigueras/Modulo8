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
public class HidroAvion extends Avion implements Nautico{

    public HidroAvion(String name, double cargaMaxima) {
        super(name, cargaMaxima);
    }
    
    @Override
    public void atracar() {
        System.out.println("Estoy en la orilla del puerto");
    }

    @Override
    public void navegar() {
        System.out.println("Estoy navegando en el mar");
    }
    
}
