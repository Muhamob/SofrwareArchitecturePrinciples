package week2.shapes;

public class Square extends Shape {
    private double x, y, length;

    public Square(double x, double y, double length) {
        // float x, y are coordinates of top left corner
        // float length is length of edge, it might be negative,
        // so that float x, y will be coordinates of bottom right corner
        this.x = x;
        this.y = y;
        this.length = length;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public double square() {
        return this.length*this.length;
    }

    @Override
    public double perimeter() {
        return 4*this.length;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength() {
        return length;
    }
}
