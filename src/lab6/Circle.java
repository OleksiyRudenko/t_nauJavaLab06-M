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
public class Circle extends Figure {
    private static int 
            Rmin=10, 
            Rmax=25;
    private static ArrayList<Circle> All=new ArrayList<Circle>();
    private int r;
     
    public Circle() { // generate random values
        super();
        setR((int)(Rmin+Math.random()*(Rmax-Rmin)));
        All.add(this);
    }
    
    public Circle(int x, int y, int r) {
        super(x,y);
        setR(r);
        All.add(this);
    }
    
    public static String dumpAll() {
        StringBuilder sb=new StringBuilder();
        for (Circle c : All) {
            sb.append(String.format("(% 3d,% 3d)[%3d]%n",c.getX(),c.getY(),c.r));
        }
        return sb.toString();
    }
    
    public static void buildRmx(String function) { // build semi-matrix of relations between circles
        for (int i=0;i<All.size()-1;i++)
            for (int j=i+1;j<All.size();j++)
                // function();
                All.get(i).relationIntersection(All.get(j));
    }
    
    public int relationIntersection(Circle a) {
        // =0 - touch
        // >0 - no intersection
        // <0 - intersect
        

        return 0;
    }
    


    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    
}
