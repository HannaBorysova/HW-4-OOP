package main.java.com.hw4.geometry.shapes2D;

import main.java.com.hw4.geometry.PlaneShape;
import main.java.com.hw4.geometry.interfaces.AreaMeasurable;
import main.java.com.hw4.geometry.interfaces.PerimeterMeasurable;
import main.java.com.hw4.geometry.vertexes.Vertex2D;

public class Circle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {
    private double radius;
    Vertex2D vertex;

    public Circle(Vertex2D vertex, double radius) {
        this.vertex = vertex;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle" + "\nVertice " + vertex + "\nPerimeter: " + getPerimeter()
                + "\nArea: " + getArea();
    }
}
