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
public class Fish extends Animal implements Pet{
    private String name;

    public Fish(int legs, String name) {
        super(legs);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void walk(){
        System.out.println("Nada");
    }
    @Override
    public void eat(){
        System.out.println("Come plantas");
    }

    @Override
    public void play() {
        System.out.println("Vas a jugar ¿?");
    }
    
}
