package main.java.com.hw4.geometry.shapes3D;

import main.java.com.hw4.geometry.SpaceShape;
import main.java.com.hw4.geometry.vertexes.Vertex3D;

public class Sphere extends SpaceShape {
    private double radius;
    Vertex3D vertex;

    public Sphere(Vertex3D vertex, double radius) {
        this.vertex = vertex;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere: " + "\nVertice " + vertex + "\nArea: " + getArea()
                + "\nVolume: " + getVolume();
    }
}
