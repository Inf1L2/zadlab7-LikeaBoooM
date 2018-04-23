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
public class Punkt2D {
    int x;
    int y;
    

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Punkt2D(){
    
}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Punkt2D punktLosuj2D() {
        Random n = new Random();
        x = ((-10) + 20)*n.nextInt();
        y = ((-10) + 20)*n.nextInt();
        Punkt2D p = new Punkt2D(n.nextInt(x),n.nextInt(y));
        return p;
        
    }

    @Override
    public String toString() {
        return "Wspołrzedne punkt2D :{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
