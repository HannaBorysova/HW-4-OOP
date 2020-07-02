package main.java.com.hw4.geometry.shapes2D;

import main.java.com.hw4.geometry.PlaneShape;
import main.java.com.hw4.geometry.interfaces.AreaMeasurable;
import main.java.com.hw4.geometry.interfaces.PerimeterMeasurable;
import main.java.com.hw4.geometry.vertexes.Vertex2D;

import java.util.Arrays;

public class Triangle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {
    private double ab;
    private double bc;
    private double ca;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        super(Arrays.asList(a, b, c));
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;

        ab = distanceBetweenTwoVertices(a, b);
        bc = distanceBetweenTwoVertices(b, c);
        ca = distanceBetweenTwoVertices(c, a);
    }

    @Override
    public double getArea() {
        double p = 0.5 * (ab + bc + ca);
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    @Override
    public double getPerimeter() {
        double perimeter = ab + bc + ca;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle" + "\nVertice A: " + ab + "\nVertice B: " + bc + "\nVertice C: " + ca
                + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
}
