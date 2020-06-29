package main.java.com.hw4.geometry.shapes2D;

import main.java.com.hw4.geometry.PlaneShape;
import main.java.com.hw4.geometry.vertexes.Vertex2D;

public class Circle extends PlaneShape {
    Vertex2D vertex2D;
    double radius;

    public Circle(int aX, int aY, double radius) {
        this.vertex2D = new Vertex2D(aX, aY);
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
        return "Circle" + "\nVertice " + vertex2D + "\nPerimeter: " + getPerimeter()
                + "\nArea: " + getArea();
    }
}
