package tests;

import org.junit.jupiter.api.Test;
import week2.shapes.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareJUnitTest implements ShapeTest {

    private Square square = new Square(1.0, 2.0, 3.0);

    @Override
    @Test
    public void testInit() {
        assertEquals(1.0, square.getX());
        assertEquals(2.0, square.getY());
        assertEquals(3.0, square.getLength());
    }

    @Override
    @Test
    public void testSquare() {
        // Made this task wrong
        assertEquals(square.square(), 9.0);
    }

    @Override
    @Test
    public void testPerimeter() {
        assertEquals(square.perimeter(), 12.0);
    }
}
