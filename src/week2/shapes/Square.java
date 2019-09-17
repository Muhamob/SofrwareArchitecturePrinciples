package week2.shapes;

public class Square extends Shape {
    private float x, y, length;

    public Square(float x, float y, float length) {
        // float x, y are coordinates of top left corner
        // float length is length of edge, it might be negative,
        // so that float x, y will be coordinates of bottom right corner
        this.x = x;
        this.y = y;
        this.length = length;
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

    public float getLength() {
        return length;
    }
}
