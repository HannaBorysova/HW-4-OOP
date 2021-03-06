package main.java.com.hw4.geometry.shapes2D;

import main.java.com.hw4.geometry.PlaneShape;
import main.java.com.hw4.geometry.interfaces.AreaMeasurable;
import main.java.com.hw4.geometry.interfaces.PerimeterMeasurable;
import main.java.com.hw4.geometry.vertexes.Vertex2D;

import java.util.Arrays;

public class Rectangle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {
    private double width, height;

    public Rectangle(Vertex2D a, double width, double height) {
        super(Arrays.asList(a));
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
        return "Rectangle " + "\nVertice " + super.toString() + "\nPerimeter: " + getPerimeter()
                + "\nArea: " + getArea();
    }
}
