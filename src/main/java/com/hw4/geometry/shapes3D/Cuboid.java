package main.java.com.hw4.geometry.shapes3D;

import main.java.com.hw4.geometry.SpaceShape;
import main.java.com.hw4.geometry.vertexes.Vertex3D;

import java.util.Arrays;

public class Cuboid extends SpaceShape {
    private int width;
    private int height;
    private int depth;

    public Cuboid(Vertex3D a, int width, int height, int depth) {
        super(Arrays.asList(a));
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width + height) + 2 * (width + height) + 2 * (width + height);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid " + "\nVertice " + super.toString() + ", width: " + width + " , height: " + height
                + " , depth: " + depth + "\nArea: " + getArea() + "\nVolume: " + getVolume();
    }
}
