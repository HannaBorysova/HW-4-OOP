package main.java.com.hw4.geometry.vertexes;

public class Vertex2D implements Vertex {
    private int x;
    private int y;

    public Vertex2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {

        return "x = " + getX() + "y = " + getY();
    }
}
