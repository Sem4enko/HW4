package Shapes;

import Geometry.abstracs.SpaceShape;
import Geometry.abstracs.Vertex3D;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Cuboid() {

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

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }


    @Override
    public void addVertex(double... point)  {
        if (point.length == 3) {
            vertices.add(new Vertex3D(point[0], point[1], point[2]));
        } else {
            System.out.println("Cuboid must have 3 vertices");
        }
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return String.format("Cuboid {%s}, width = %s, height = %s, depth = %s, volume = %s, area = %s ",
                vertices.get(0),
                width,
                height,
                depth,
                Math.ceil(getVolume()),
                Math.ceil(getArea()));
    }
}
