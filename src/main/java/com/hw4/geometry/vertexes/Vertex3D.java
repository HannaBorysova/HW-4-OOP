package main.java.com.hw4.geometry.vertexes;

public class Vertex3D extends Vertex2D {
    private int z;

    public Vertex3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "x = " + getX() + "y = " + getY() + "z = " + getZ();
    }
}
