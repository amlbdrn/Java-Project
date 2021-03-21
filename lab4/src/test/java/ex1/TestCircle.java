package ex1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCircle {

    @Test
    void testConstructorWithoutParameters() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius());
        assertEquals("red", circle.getColor());
    }

    @Test
    void testConstructorWith2Parameters() {
        Circle circle = new Circle(15.0,"blue");
        assertEquals(15.0, circle.getRadius());
        assertEquals("blue", circle.getColor());
    }

    @Test
    void testCircleWith1Parameter() {
        Circle circle=new Circle(21.5);
        assertEquals(21.5,circle.getRadius());
    }

    @Test
    void testAreaMethod() {
        Circle circle=new Circle();
        assertEquals(1.0*1.0*Math.PI,circle.getArea());
    }

    @Test
    void testRadiusMethod() {
        Circle circle=new Circle();
        assertEquals(1.0, circle.getRadius());
    }

}