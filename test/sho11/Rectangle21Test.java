package sho11;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * loist11-21のテスト
 */
class Rectangle21Test {
    @Test
    public void equalsTest() {
        Rectangle21 rectangle21 = new Rectangle21(10, 20);
        Rectangle21 rectangle211 = new Rectangle21(10, 20);
        assertTrue(rectangle21.equals(rectangle211));

    }
}