/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module7.abstracta.figura;

/**
 *
 * @author user
 */
public class Cuadrado3D extends Figura3D {

    private int lado;
    
    public Cuadrado3D(int x, int z, int y, String color, int lado) {
        super(x, y, z, color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
    //"Dibujo un cuadrado en 3D de lado " + lado + " en la posicion [" + x + ", " + y + ", " + z + "]"    
        System.out.println("Dibujo un cuadrado en 3D de lado " + lado +
                " en la posicion [" + x + ", " + y + ", " + z + "]");
    }
    
    public static void main(String[] args) {
        Cuadrado3D c = new Cuadrado3D(1,2,3, "Rojo", 4);
        c.dibujar();
    }
    
}
