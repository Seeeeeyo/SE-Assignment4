package main;
import svg.element.Element;
import svg.element.Shape.Shape;
import svg.shape.concretes.Circle;
import svg.shape.concretes.Ellispe;
import svg.shape.concretes.Line;
import svg.shape.concretes.Point2D;
import svg.shape.concretes.Polygon;
import svg.shape.concretes.Polyline;
import svg.shape.concretes.Rect;

import java.util.List;
import java.util.Scanner;

public class singeleton {
    public singeleton(){

    }

    List<svg.element.Element> prototypes = new List<>;
    String newObject;

    public void elementFactory(){

        prototypes.add({
            new Circle(),
            new Ellispe(),
            new Rect(),
            new Polygon(),
            new Point2D(),
            new Polyline(null),
            new Line()
        }
        );
    }


    public Shape makeElement(String label){

        for(svg.element.Element e : prototypes){
            if (e.toString().equals(label)){
                newObject = label;
            }
        }

       // element.newInstance();
    }
}
