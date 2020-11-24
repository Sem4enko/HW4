package Geometry.abstracs;


import java.util.ArrayList;
import java.util.List;
    public abstract class Shape {
        protected List<Vertex2D> vertices = new ArrayList<>();

        public List<Vertex2D> getVertices() {
           return vertices;
        }

        public abstract void addVertex(double... point);

    }

