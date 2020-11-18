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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Volable v = new Pajaro();
        v.aterrizar();
        if(v instanceof Pajaro){
            ((Pajaro) v).cantar();
        }
        
        int altura = Volable.ALTURA_MAX_VUELO;
        
    }
    
}
