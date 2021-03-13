package ex1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRobot {

    @Test
    void testConstructorClass() {
        Robot robot = new Robot();
        assertEquals(1,robot.getX());
    }

    @Test
    void testChangeWhenValueIsHigherThan1() {
        Robot robot=new Robot();
        assertEquals(1,robot.getX());
        robot.Change(10);
        assertEquals(11,robot.getX());
    }

    @Test
    void testChangeWhenValueIsLowerThan1() {
        Robot robot=new Robot();
        assertEquals(1,robot.getX());
        robot.Change(0);
        assertEquals(1,robot.getX());
    }


}

