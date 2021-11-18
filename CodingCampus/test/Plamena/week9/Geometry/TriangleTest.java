package Plamena.week9.Geometry;

import Plamena.week9.Geometry.Triangle;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void getCircumferenceTest() throws Exception {
        Assertions.assertEquals(6, new Triangle(1, 2, 2).getCircumference());
    }

    @Test
    public void getAreaTest() throws Exception {
        Assertions.assertEquals(0.97, new Triangle(1,2,2).getArea(), 0.01);
    }
}
