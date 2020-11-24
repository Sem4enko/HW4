
import Geometry.abstracs.Shape;
import Shapes.*;

import java.util.ArrayList;
import java.util.List;
public class Geometry {
    public static void main(String[] args){

       List<Shape> shapes = new ArrayList<>();
        // Plane shapes
        Shape triangle = new Triangle();
        triangle.addVertex(5.7, 3.9, 7.7, 4.8, 2.5, 2.6);
        Shape circle = new Circle(22.5);
        circle.addVertex(9.8, 7.2);
        Shape rectangle = new Rectangle(8.3, 10.3);
        rectangle.addVertex(8, 6);
        // Space shapes
        Shape sphere = new Sphere(2);
        sphere.addVertex(4, 9, 15);
        Shape squarePyramid = new SquarePyramid(18, 14);
        squarePyramid.addVertex(12.5, 3, 6.3);
        Shape cuboid = new Cuboid(7, 18, 6.7);
        cuboid.addVertex(18.0, 19.7, 17);

        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(sphere);
        shapes.add(squarePyramid);
        shapes.add(cuboid);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }


    }
}

