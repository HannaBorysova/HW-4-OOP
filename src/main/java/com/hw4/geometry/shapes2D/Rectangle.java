package main.java.com.hw4.geometry.shapes2D;

import main.java.com.hw4.geometry.PlaneShape;
import main.java.com.hw4.geometry.vertexes.Vertex2D;

public class Rectangle extends PlaneShape {
    Vertex2D vertex2D;
    double width, height;

    public Rectangle(int aX, int aY, double width, double height) {
        this.vertex2D = new Vertex2D(aX, aY);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height);
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle " + "\nVertice " + vertex2D + "\nPerimeter: " + getPerimeter()
                + "\nArea: " + getArea();
    }
}
