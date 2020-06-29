package main.java.com.hw4.geometry.shapes3D;

import main.java.com.hw4.geometry.SpaceShape;
import main.java.com.hw4.geometry.vertexes.Vertex3D;

public class SquarePyramid extends SpaceShape {
    Vertex3D vertex3D;
    double baseWidth;
    double pyramidHeight;

    public SquarePyramid(int aX, int aY, int aZ, double baseWidth, double pyramidHeight) {
        this.vertex3D = new Vertex3D(aX, aY, aZ);
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        return (baseWidth * 2) + (1 / 2) * (baseWidth * 4) * pyramidHeight;
    }

    @Override
    public double getVolume() {
        return ((double) 1 / 3) * pyramidHeight * Math.pow(baseWidth, 2);
    }

    @Override
    public String toString() {
        return "SquarePyramid " + "\nVertice " + vertex3D + ", baseWidth: " + baseWidth
                + ", pyramidHeight: " + pyramidHeight + "\nArea: " + getArea()
                + "\nVolume: " + getVolume();
    }
}
