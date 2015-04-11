/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.*;


/**
 *
 * @author oleksiy.rudenko@gmail.com
 */
public class Circle {
    private static int 
            Xmin=-100, 
            Xmax=100, 
            Ymin=-100, 
            Ymax=100, 
            Rmin=10, 
            Rmax=25;
    private static ArrayList<Circle> All=new ArrayList<Circle>();
    static { // used to initialize static fields
        
    }
    { } // called before constructor for each new object
    private int x, y, r;
    
    public Circle() { // generate random values
        setX((int)(Xmin+Math.random()*(Xmax-Xmin)));
        setY((int)(Ymin+Math.random()*(Ymax-Ymin)));
        setR((int)(Rmin+Math.random()*(Rmax-Rmin)));
        All.add(this);
    }
    
    public Circle(int x, int y, int r) {
        setX(x); setY(y); setR(r);
        All.add(this);
    }
    
    public static String dumpAll() {
        StringBuilder sb=new StringBuilder();
        
        for (Circle c : All) {
            sb.append(String.format("(% 3d,% 3d)[%3d]%n",c.x,c.y,c.r));
        }
        
        buildRmx();
        
        return sb.toString();
    }
    
    public static void buildRmx() { // build semi-matrix of relations between circles
        // 0 - touch
        // >0 - no intersection
        // <0 - intersect
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    
}
