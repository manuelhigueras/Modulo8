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
public interface Volable {
    // constantes static 
    public static final int ALTURA_MAX_VUELO = 20_000;//pies
    // metodos abstractos - lo pongas o no, siempre es public abstracta
    public abstract void despegar();
    abstract void aterrizar();
    void volar();
    
}
