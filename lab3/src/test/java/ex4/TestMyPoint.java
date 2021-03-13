package ex4;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.Math;


class TestMyPoint {

    @Test
    void testMyPoint() {
        MyPoint point = new MyPoint();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void testMyPointWithParameters() {
        MyPoint point = new MyPoint(5, 3);
        assertEquals(5, point.getX());
        assertEquals(3, point.getY());
    }

}
