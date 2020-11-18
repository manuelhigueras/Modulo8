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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cat garfield = new Cat(4,"Garfield");
        garfield.jugar();
        Fish dorado = new Fish(0, "Dorado");
        System.out.println(dorado.getName());
        Spider araña = new Spider(8);
        Animal atun = new Fish(0, "Atun");
        Animal arañaNormal = new Spider(10);
        araña.eat();
          
    }
    
}
