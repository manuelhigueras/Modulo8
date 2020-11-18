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
public abstract class Figura {
    protected int x, y;
    protected String color;

    public Figura(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figura{" + "x=" + x + ", y=" + y + ", color=" + color + '}';
    }
    
    public abstract void dibujar();
    
}
