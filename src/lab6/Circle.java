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
    
    public String dump() {
        return String.format("(% 3d,% 3d) %s r=%3d",getX(),getY(),getClass().getName(),r);
    }
    
    public static String dumpAll() {
        StringBuilder sb=new StringBuilder();
        for (Circle f : All) {
            sb.append(f.dump()+String.format("%n"));
        }
        return sb.toString();
    }
    
    public static FigurePair [] getRelationArray(String function) { // build semi-matrix of relations between circles
        FigurePair fp[]=new FigurePair[(All.size()*All.size()-All.size())/2];
        int fpcount=0;
        for (int i=0;i<All.size()-1;i++)
            for (int j=i+1;j<All.size();j++)
                // function();
                
                // see p.381 of Schildt
                fp[fpcount++]=new FigurePair(
                        All.get(i),
                        All.get(j),
                        All.get(i).relationIntersection(All.get(j))
                    );
        return fp;
    }
    
    public double relationIntersection(Circle c) {
        // =0 - touch
        // <0 - no intersection
        // >0 - intersect
        double  vx=Math.abs(getX()-c.getX()),
                vy=Math.abs(getY()-c.getY());
        return (r+c.r)-Math.sqrt(vx*vx+vy*vy);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    
}
