package tests;

import org.junit.jupiter.api.Test;
import week2.shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleJUnitTest implements ShapeTest {

    private Rectangle rectangle = new Rectangle(1.0, 2.0, 3.0, 4.0);

    @Override
    @Test
    public void testInit() {
        assertEquals(1.0, rectangle.getX());
        assertEquals(2.0, rectangle.getY());
        assertEquals(3.0, rectangle.getWidth());
        assertEquals(4.0, rectangle.getHeight());
    }

    @Override
    @Test
    public void testSquare() {
        assertEquals(rectangle.square(), 12.0);
    }

    @Override
    @Test
    public void testPerimeter() {
        assertEquals(rectangle.perimeter(), 14.0);
    }
}
