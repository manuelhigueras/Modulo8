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
public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado, int x, int y, String color) {
        super(x, y, color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo un cuadrado de lado " + lado + " en la posicion [" + x + ", " + y + "]");
    }
}
