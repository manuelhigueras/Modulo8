/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module7.abstracta.informes;

import java.io.PrintStream;
import module7.abstracta.domain.Empresa;
import module7.abstracta.domain.Vehiculo;

/**
 *
 * @author user
 */
public class InformeCombustibleNecesario {
    Empresa empresa;
    
    public InformeCombustibleNecesario(Empresa empresa){
        this.empresa = empresa;
    }
    
    public void generateText(PrintStream output){
        Vehiculo v;
        double combustible;
        double total_combustible = 0.0;
        for(int i = 0; i < empresa.getTamnoFlota(); i++){
            v = empresa.getVehiculo(i);
            combustible = v.calDistanticaViaje() / v.calEficienciaConsumo();
            System.out.println("El vehiculo necesita " + combustible + " litros de combustibles");
            total_combustible += Math.round(combustible);
        }
        System.out.println("Total Consumo necesario de flota "+ total_combustible);
    }
    
}
