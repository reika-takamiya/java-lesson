package sho11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * list11-1のテスト
 */
class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSize(10, 5);
        assertEquals(50, rectangle.getArea());
    }
}
