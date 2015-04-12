/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author oleksiy.rudenko@gmail.com
 */
public class FigurePair {
    Figure f[]=new Figure[2];
    double relation;
    
    public FigurePair(Figure f1, Figure f2, double relation) {
        f[0]=f1;
        f[1]=f2;
        this.relation=relation;
    }
    
    public Figure get1() { return f[0]; }
    public Figure get2() { return f[1]; }
    public Figure[] getPair() { return f; }
    public double getRelation() { return relation; }
    
}
