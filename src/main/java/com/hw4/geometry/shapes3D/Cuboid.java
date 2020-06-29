package main.java.com.hw4.geometry.shapes3D;

import main.java.com.hw4.geometry.SpaceShape;
import main.java.com.hw4.geometry.vertexes.Vertex3D;

public class Cuboid extends SpaceShape {
    Vertex3D vertex3D;
    int width;
    int height;
    int depth;

    public Cuboid(int aX, int aY, int aZ, int width, int height, int depth) {
        this.vertex3D = new Vertex3D(aX, aY, aZ);
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
        return "Cuboid " + "\nVertice " + vertex3D + ", width: " + width + " , height: " + height
                + " , depth: " + depth + "\nArea: " + getArea() + "\nVolume: " + getVolume();
    }
}
