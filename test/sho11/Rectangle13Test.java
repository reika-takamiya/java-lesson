package sho11;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * list11-13のテスト
 */
class Rectangle13Test {
    @Test
    public void testArea() {
        Rectangle13 rectangle13 = new Rectangle13(10, 20);
        Rectangle13 rectangle131 = new Rectangle13(40, 50);
        assertEquals(200, Rectangle13.getArea(rectangle13));
        assertEquals(2000, Rectangle13.getArea(rectangle131));
    }

}