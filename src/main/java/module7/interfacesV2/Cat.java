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
public class Cat extends Animal{
    private String name;

    public Cat(int legs, String name) {
        super(legs);
        this.name = name;
    }
    
    public Cat(){
        super(0);
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void jugar(){
        System.out.println("Estas jugando");
    }
            
    public void eat(){
        System.out.println("Estas comiendo gatarina");
    }
    
}
