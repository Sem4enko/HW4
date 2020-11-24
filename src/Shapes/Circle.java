package Shapes;

import Geometry.abstracs.PlaneShape;
import Geometry.abstracs.Vertex2D;

public class Circle extends PlaneShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void addVertex(double... point) {
        if (point.length == 2) {
            vertices.add(new Vertex2D(point[0], point[1]));
        } else {
            System.out.println(" Circle must have 1 vertex");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return String.format("Circle {%s}, perimeter = %s ",
                vertices.get(0),
                Math.ceil(getPerimeter()) + ", area = " + Math.ceil(getArea()));
    }
}
