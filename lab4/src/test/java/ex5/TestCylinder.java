package ex5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCylinder {

    @Test
    void TestWithNoParameters(){
        Cylinder c=new Cylinder();
        assertEquals(1.0, c.getHeight());
        assertEquals(0, c.getVolume());
    }

    @Test
    void TestWith1Parameter(){
        Cylinder c=new Cylinder(1.50);
        assertEquals(1.50, c.getRadius());
    }

    @Test
    void TestWith2Parameters(){
        Cylinder c=new Cylinder(1.50,1.0);
        assertEquals(1.50, c.getRadius());
        assertEquals(1.0, c.getHeight());
    }




}
