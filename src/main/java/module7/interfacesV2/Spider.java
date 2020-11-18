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
public class Spider extends Animal{

    int patas;
    
    public Spider() {
        super(0);
        int patar = 0;
    }

    public Spider(int patas, int legs) {
        super(legs);
        this.patas = patas;
    }
    
    public Spider(int numPatas){
        super(0);
        this.patas = numPatas;
    }
    
    public void eat(){
        System.out.println("Dale los insectos");
    }
    
}
