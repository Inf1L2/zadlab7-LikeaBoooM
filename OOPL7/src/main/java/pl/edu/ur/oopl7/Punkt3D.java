/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;

/**
 *
 * @author Mati
 */
public class Punkt3D extends Punkt2D {

    int z;

    public Punkt3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
    public Punkt3D(){
        
    }
    
    public Punkt3D punktLosuj3D(){
    Random n = new Random();
    x = ((-10) + 20)*n.nextInt();
    y = ((-10) + 20)*n.nextInt();  
    z = ((-10) + 20)*n.nextInt();   
    Punkt3D p = new Punkt3D(n.nextInt(x),n.nextInt(y),n.nextInt(z));
    return p;
}

    @Override
    public String toString() {
        return super.toString() + "z=" + z ;
    }

        
    
}
