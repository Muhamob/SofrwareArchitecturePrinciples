package week2.shapes;

public class Rectangle extends Shape {
    private double x, y, width, height;

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public double square() {
        return this.width*this.height;
    }

    @Override
    public double perimeter() {
        return 2*(this.width+this.height);
    }

    public Rectangle(double x, double y, double width, double height) {
        // float x, y are coordinates of top left corner if width and height are positive
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
