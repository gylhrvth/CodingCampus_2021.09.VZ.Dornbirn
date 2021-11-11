package Eray.week6.uebungsBeispiele;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayNumberIntAndFloatWithBubbleSortTest {
    @Test
    public void swapFloatTest() {
        float[] values = {3.5f, 2.4f, 10, 20, 1.0f, -10f};
        float[] expected = {-10f, 1.0f, 2.4f, 3.5f, 10, 20};
        ArrayNumbersIntAndFloatWithBubbleSort.swapFloat(values);
        Assertions.assertArrayEquals(expected, values);

        values = new float[] {3.5f, 2.4f, 10, 20, 1.0f, -10f};
        expected = new float[] {1.0f, 2.4f, 3.5f, 10, 20};

        ArrayNumbersIntAndFloatWithBubbleSort.swapFloat(values);
        Assertions.assertFalse(Arrays.equals(values, expected));
    }
}
