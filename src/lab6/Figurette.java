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
public class Figurette extends Figure {
    private static ArrayList<Figurette> All=new ArrayList<Figurette>();
    static { // used to initialize static fields
    }
    { } // called before constructor for each new object

    public Figurette() { // generate random values
        super();
        All.add(this);
    }
    
    public Figurette(int x, int y) {
        super(x,y);
        All.add(this);
    }
    
    public static String dumpAll() {
        StringBuilder sb=new StringBuilder();
        for (Figurette c : All) {
            sb.append(String.format("(% 3d,% 3d)%n",c.getX(),c.getY()));
        }
        return sb.toString();
    }
    
}
