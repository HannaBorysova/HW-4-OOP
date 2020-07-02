package main.java.com.hw4.geometry.shapes3D;

import main.java.com.hw4.geometry.SpaceShape;
import main.java.com.hw4.geometry.vertexes.Vertex3D;

public class Cuboid extends SpaceShape {
    private int width;
    private int height;
    private int depth;
    Vertex3D vertex;

    public Cuboid(Vertex3D vertex, int width, int height, int depth) {
        this.vertex = vertex;
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
        return "Cuboid " + "\nVertice " + vertex + ", width: " + width + " , height: " + height
                + " , depth: " + depth + "\nArea: " + getArea() + "\nVolume: " + getVolume();
    }
}
