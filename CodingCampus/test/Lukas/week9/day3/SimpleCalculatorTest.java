package Lukas.week9.day3;

import org.junit.jupiter.api.*;

public class SimpleCalculatorTest {
    private String myString;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests...");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all tests...");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test...");
        //Wird vor jedem Testfall ausgeführt
        myString = "alsdkfjasdf";
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each test...");
        //Wird nach jedem Testfall ausgeführt
    }

    @Test
    public void addTest() {
        Assertions.assertEquals(10, SimpleCalculator.add(5, 5));
    }

    @Test
    public void piTest() {
        Assertions.assertEquals(3.14f, Math.PI, 0.01);
    }

    @Test
    public void mulTest() {
        Assertions.assertEquals(10, SimpleCalculator.mul(2, 5));
        Assertions.assertEquals(-1, SimpleCalculator.mul(1, -1));
    }
}
