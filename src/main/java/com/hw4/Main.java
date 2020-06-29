package main.java.com.hw4;

import main.java.com.hw4.geometry.Shape;
import main.java.com.hw4.geometry.shapes2D.Circle;
import main.java.com.hw4.geometry.shapes2D.Rectangle;
import main.java.com.hw4.geometry.shapes2D.Triangle;
import main.java.com.hw4.geometry.shapes3D.Cuboid;
import main.java.com.hw4.geometry.shapes3D.Sphere;
import main.java.com.hw4.geometry.shapes3D.SquarePyramid;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(0, 2, 4, 8, 6, 4);
        Rectangle rectangle = new Rectangle(4, 3, 4, 6);
        Circle circle = new Circle(4, 5, 3);
        SquarePyramid squarePyramid = new SquarePyramid(1, 5, 4, 5, 7);
        Cuboid cuboid = new Cuboid(3, 0, 2, 5, 8, 3);
        Sphere sphere = new Sphere(4, 4, 2, 3);

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
