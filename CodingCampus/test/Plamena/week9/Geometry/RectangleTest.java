package Plamena.week9.Geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void getCircumferenceTest() {
        Assertions.assertEquals(12.0, new Rectangle(2.0, 4.0).getCircumference());
    }

    @Test
    public void getAreaTest() {
        Assertions.assertEquals(8.0, new Rectangle(2.0, 4.0).getArea());
    }
}
