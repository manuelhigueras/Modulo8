/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module7.abstracta.informes;

import module7.abstracta.domain.Barcaza;
import module7.abstracta.domain.Camion;
import module7.abstracta.domain.Empresa;
import module7.abstracta.domain.Vehiculo;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barcaza b = new Barcaza(7.6);
        System.out.println(b.calDistanticaViaje());
        System.out.println(b.getCargaMaxima());
//        Vehiculo v = new Vehiculo(2.1);
//        Camion c = new Camion(2.8);
        Empresa e = new Empresa();
        e.addVehiculo(new Camion(10_000));
        e.addVehiculo(new Barcaza(25_000));
        e.addVehiculo(new Barcaza(10_000));
        e.addVehiculo(new Camion(120_000));
        e.addVehiculo(new Camion(50_000));
        
        InformeCombustibleNecesario informe = new InformeCombustibleNecesario(e);
        informe.generateText(System.out);
        
        
    }
    
}
