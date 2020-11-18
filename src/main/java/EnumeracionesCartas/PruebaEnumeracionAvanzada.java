/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumeracionesCartas;

/**
 *
 * @author user
 */
public class PruebaEnumeracionAvanzada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Palo p1 = Palo.OROS;
        System.out.println("nombre : " + p1.name());
        System.out.println(" ordinal : " + p1.ordinal());
        System.out.println(" valor : " + p1.getValor());
        
        System.out.println("-----------------------------");
        
        Palo p2 = Palo.OROS;
        System.out.println("Nombre: " + p2.toString());
        
        
    }
    
}
