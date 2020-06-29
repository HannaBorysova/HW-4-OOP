package main.java.com.hw4.geometry;

import main.java.com.hw4.geometry.interfaces.AreaMeasurable;
import main.java.com.hw4.geometry.interfaces.VolumeMeasurable;
import main.java.com.hw4.geometry.vertexes.Vertex3D;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    List<Vertex3D> ListOfVertices3D;
}