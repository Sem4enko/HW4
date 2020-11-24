package Shapes;

import Geometry.abstracs.PlaneShape;
import Geometry.abstracs.Vertex2D;

public class Rectangle extends PlaneShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void addVertex(double... point)  {
        if (point.length == 2) {
            vertices.add(new Vertex2D(point[0], point[1]));
        } else {
            System.out.println(" Rectangle shape must have 1 vertices");
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return String.format("Rectangle {%s}, perimeter = %s ",
                vertices.get(0),
                Math.ceil(getPerimeter()) + ", area = " + Math.ceil(getArea()));
    }
}
