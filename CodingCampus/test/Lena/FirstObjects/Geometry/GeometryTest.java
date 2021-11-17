package Lena.FirstObjects.Geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeometryTest {
    private Circle circle;
    private Triangle triangle;

    @BeforeEach
    public void beforeEach() {
        this.circle = new Circle(5);
        this.triangle = new Triangle(2, 3, 4);
    }

    @Test
    public void circleCircumferenceTest() {

        double expected = 31.416;
        Assertions.assertEquals(expected, circle.getCircumference(), 0.001);
    }

    @Test
    public void circleAreaTest() {
        double expected = 78.53981633974483;
        Assertions.assertEquals(expected, circle.getArea());
    }

    @Test
    public void alphaTest() {
        double expected = 28.955;
        Assertions.assertEquals(expected, triangle.calculateAlpha(), 0.001);

    }

    @Test
    public void betaTest() {
        double expected = 46.567;
        Assertions.assertEquals(expected, triangle.calculateBeta(), 0.001);

    }

    @Test
    public void triangleCircumferenceTest() {
        double expected = 2.905;
        Assertions.assertEquals(expected, triangle.getCircumference(), 0.001);

    }

    @Test
    public void triangleHighTest() {
        double expected = 2.905;
        Assertions.assertEquals(expected, triangle.getHigh());
    }
}
