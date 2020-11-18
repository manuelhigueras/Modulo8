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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avion boing = new Avion("boing",44);
        Vehiculo barcaza = new Barcaza(7);
        HidroAvion hidrogh = new HidroAvion("PN4J1Duup7754315", 6);
        Avion helicoptero = new Helicopter("T12436DD", 1280);
        
       boing.aterrizar();
       System.out.println(barcaza.calEficienciaConsumo());
       hidrogh.navegar();
       helicoptero.despegar();
        
    }
    
}
