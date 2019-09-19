package week2.shapes;

public class Circle extends Shape {
    private double x, y, r;

    public Circle(double x, double y, double r) {
        // float x, y are coordinates of center
        // float r is radius
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.r;
    }

    public double getR() {
        return r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
