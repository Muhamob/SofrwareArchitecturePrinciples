package week2.shapes;

public class Circle extends Shape {
    private float x, y, r;

    public Circle(float x, float y, float r) {
        // float x, y are coordinates of center
        // float r is radius
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public float getR() {
        return r;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
