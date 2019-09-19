package tests;

import org.junit.jupiter.api.Test;
import week2.shapes.Circle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleJUnitTest implements ShapeTest {

    private Circle circle = new Circle(1.0, 2.0, 3.0);

    @Override
    @Test
    public void testInit() {
        assertEquals(1.0, circle.getX());
        assertEquals(2.0, circle.getY());
        assertEquals(3.0, circle.getR());
    }

    @Override
    @Test
    public void testSquare() {
        assertEquals(circle.square(), Math.PI*3.0*3.0);
    }

    @Override
    @Test
    public void testPerimeter() {
        assertEquals(circle.perimeter(), 2*Math.PI*3.0);
    }
}
