package main.java.com.hw4;

import main.java.com.hw4.geometry.Shape;
import main.java.com.hw4.geometry.shapes2D.Circle;
import main.java.com.hw4.geometry.shapes2D.Rectangle;
import main.java.com.hw4.geometry.shapes2D.Triangle;
import main.java.com.hw4.geometry.shapes3D.Cuboid;
import main.java.com.hw4.geometry.shapes3D.Sphere;
import main.java.com.hw4.geometry.shapes3D.SquarePyramid;
import main.java.com.hw4.geometry.vertexes.Vertex2D;
import main.java.com.hw4.geometry.vertexes.Vertex3D;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Vertex2D(2, 2), new Vertex2D(1, 0), new Vertex2D(-1, 4));
        Rectangle rectangle = new Rectangle(new Vertex2D(1, 1), 3, 3);
        Circle circle = new Circle(new Vertex2D(0, 4), 5);
        SquarePyramid squarePyramid = new SquarePyramid(new Vertex3D(0, 2, 2), 5, 7);
        Cuboid cuboid = new Cuboid(new Vertex3D(1, 1, 0), 4, 2, 5);
        Sphere sphere = new Sphere(new Vertex3D(2, 1, 3), 3);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(squarePyramid);
        shapes.add(cuboid);
        shapes.add(sphere);

        for (Shape myShape : shapes) {
            System.out.println("__________");
            System.out.println(myShape.toString());
        }
    }
}
