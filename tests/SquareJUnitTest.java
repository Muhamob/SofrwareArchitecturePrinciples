import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import week2.shapes.Square;

public class SquareJUnitTest {
    @Test
    public void testInit() {
        Square square = new Square(1.0f, 1.0f, 1.0f);
        assertEquals(1.0f, square.getX());
    }
}
