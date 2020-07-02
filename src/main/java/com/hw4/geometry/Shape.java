package main.java.com.hw4.geometry;

import main.java.com.hw4.geometry.vertexes.Vertex;
import main.java.com.hw4.geometry.vertexes.Vertex2D;
import main.java.com.hw4.geometry.vertexes.Vertex3D;

import java.util.List;


public abstract class Shape {

    public double distanceBetweenTwoVertices(Vertex2D a, Vertex2D b) {
        return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2)));
    }

    public double distanceBetweenVerticesThreeD(Vertex3D a, Vertex3D b) {
        return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2))
                + Math.pow((a.getZ() - b.getZ()), 2));
    }

    private List<Vertex> vertices;

    public Shape(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "vertices=" + vertices +
                '}';
    }
}
