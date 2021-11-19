package Plamena.week9.Geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void getCircumferenceTest(){
        Assertions.assertEquals(31.416, new Circle(5.0).getCircumference(), 0.001);
    }

    @Test
    public void getAreaTest(){
        Assertions.assertEquals(78.54, new Circle(5.0).getArea(), 0.01);
    }
}
