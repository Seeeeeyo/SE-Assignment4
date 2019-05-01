import com.sun.xml.internal.rngom.parse.host.Base;
import svg.element.Element;
import svg.element.Shape.Shape;

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
            new Polyline(),
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
