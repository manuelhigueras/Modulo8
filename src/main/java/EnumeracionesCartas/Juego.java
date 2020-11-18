/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumeracionesCartas;

import java.util.Random;

/**
 *
 * @author user
 */
public class Juego {
    public static void main(String[] args) {
        
        Random rd = new Random();
        int valorAleatorio = rd.nextInt(12);
        Random rd2 = new Random();
        int valorAleatorio2 = rd2.nextInt(12);
        
        Carta c = new Carta(Palo.BASTOS,valorAleatorio);
        Carta c2 = new Carta(Palo.COPAS,valorAleatorio2);
        
        System.out.println("INICIO DE CARTAS");
        System.out.println("CARTA 1");
        System.out.println(c.toString());
        System.out.println("CARTA 2");
        System.out.println(c2.toString());
        
        int resultado = c2.comparar(c,c2);
        System.out.println("GANA EL VALOR " + resultado);
        System.out.println(Palo.BASTOS);
        Palo[] palosBaraja = Palo.values();
        
        
//        for(Palo p: palosBaraja){
//            System.out.println(p);
//        }
        
       c = c.cambiarCartaValor(c);
       c2 = c.cambiarCartaValor(c2);
       System.out.println(c.toString());
       System.out.println(c2.toString());
    }
}
