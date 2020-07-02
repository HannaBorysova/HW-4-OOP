package main.java.com.hw4.geometry;

import main.java.com.hw4.geometry.interfaces.AreaMeasurable;
import main.java.com.hw4.geometry.interfaces.PerimeterMeasurable;
import main.java.com.hw4.geometry.vertexes.Vertex;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    List<Vertex> vertices;
}
