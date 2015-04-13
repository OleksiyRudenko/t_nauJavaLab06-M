/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;


interface Ii {
    int func(int a, int b);
}

/**
 *
 * @author oleksiy.rudenko@gmail.com
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ii oi;
        oi= (n,m) -> n+m;
        oi.func(5,6);
        
        
        // test user change
        // Lab 6
    //    Обработка наборов данных на языке Java2 
    //    (коллекции: списки, множества, карты отображения)
    //
    //    Цель работы: Исследовать типы коллекций на языке Java2 и работу с ними.
    //
    //    Задание: 1. Изучить библиотеку классов для работы с коллекциями на языке Java2.
    //    2. Написать программу на языке Java2, которая создает коллекцию согласно 
    // варианта задания, и обрабатывает ее.
    //
    //    11.	На плоскости задано множество N окружностей
    //    с координатами (xi, yi, ri), где (xi, yi) – координаты центра,
    //    ri – радиус окружности. Определить пересекаются ли окружности, 
    //    или касаются, или не имеют общих точек.
        
        
    String str="ava";
    char ch=0x74;
    str=ch+str;
    System.out.println("0x74+\"ava\"="+str+" - Why not Java???"); // why not Java but tava?
    
    // make abstract class Figure, collect figures there, 
    // static method findDistance, 
    // static abstract method String identity() - 
    // static method traversePairs(method,types...)
    // returns [pair,result of method]
    
    for (int i=0;i<5;i++) new Circle();
    // put few tangent test objects
    new Circle(10,10,10);
    new Circle(30,10,10);
    new Circle(30,30,10);

    FigurePair fpa[]=Circle.getRelationArray("relationIntersection");
    
    System.out.println("Circle relations:");
    
    for (FigurePair fp : fpa)
        System.out.println(fp.get1().dump() + " R " +
                fp.get2().dump() + " = " +
                String.format("% 9.06f -- %s",
                        fp.getRelation(),
                        (fp.getRelation()==0.0)?"tangent":
                                (fp.getRelation()>0.0)?"intersect":
                                        "no intersection"
                    ));
    
   
    // === supplementary tests
    /*
    new Figure();
    
    new Figurette();
    new Figurette();
    
    
    System.out.println("All figures:\n"+Figure.dumpAll());
    System.out.println("All circles:\n"+Circle.dumpAll());
    System.out.println("All figurettes:\n"+Figurette.dumpAll());
    
    */
 
    // Circle c=new Circle(30,30,10);
    
    

    }
    
}
