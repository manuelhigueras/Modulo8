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
public abstract class Figura3D extends Figura {
    protected int z;

    public Figura3D(int x, int z, int y, String color) {
        super(x, y, color);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

}
