package week2.shapes;

public class Rectangle extends Shape {
    private float x, y, width, height;

    public Rectangle(float x, float y, float width, float height) {
        // float x, y are coordinates of top left corner if width and height are positive
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
