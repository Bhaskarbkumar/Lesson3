package test;

import java.util.ArrayList;
import model.Shape;
import java.awt.Color;
import model.Circle;
import model.Rectangle;
;
public class ShapeTest {

    public static void main(String[] args){

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(0,0,Color.white,1));
        shapes.add(new Circle(1,1,Color.white,2));
        shapes.add(new Rectangle(10, 10, Color.yellow, 5, 5));

        for(var s:shapes){

            System.out.println(s.toString());
        }



    }
    
}