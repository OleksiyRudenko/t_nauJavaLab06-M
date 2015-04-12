/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.ArrayList;

/**
 *
 * @author oleksiy.rudenko@gmail.com
 */
public class Figure {
        private static ArrayList<Figure> All=new ArrayList<Figure>();

    private static int 
            Xmin=-100, 
            Xmax=100, 
            Ymin=-100, 
            Ymax=100;

    private int x, y;

    public Figure() { // generate random values
        setX((int)(Xmin+Math.random()*(Xmax-Xmin)));
        setY((int)(Ymin+Math.random()*(Ymax-Ymin)));
        All.add(this);
    }
    
    public Figure(int x, int y) {
        setX(x); setY(y);
        All.add(this);
    }
    
    public String dump() {
        return String.format("(% 3d,% 3d) %s",getX(),getY(),getClass().getName());
    }
    
    public static String dumpAll() {
        StringBuilder sb=new StringBuilder();
        for (Figure f : All) {
            sb.append(f.dump()+String.format("%n"));
        }
        return sb.toString();
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

}