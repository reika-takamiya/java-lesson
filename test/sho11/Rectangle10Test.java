package sho11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * list11-10のテスト
 */
class Rectangle10Test {
    @Test
    public void testNumber() {
        Rectangle10 rectangle10 = new Rectangle10();
        Rectangle10 rectangle101 = new Rectangle10();
        assertEquals(0, rectangle10.number);
        assertEquals(2, rectangle101.number);
    }

    @Test
    public void testCounter() {
        Rectangle10 rectangle102 = new Rectangle10();
        assertEquals(1, rectangle102.getCounter());
        Rectangle10 rectangle103 = new Rectangle10();
        assertEquals(2, rectangle102.getCounter());
    }

    @Test
    public void testSize() {
        Rectangle10 rectangle104 = new Rectangle10();
        assertEquals(10, rectangle104.width);
        assertEquals(20, rectangle104.height);
    }
}