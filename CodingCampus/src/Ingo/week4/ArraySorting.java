package Ingo.week4;

public class ArraySorting {
    public static void main(String[] args) {

        int[] numbers = {-2, -5, -1, -3, -4, 0, 3, 5, 4, 2, 1};
//        int[] sortiert = selectionSorting(numbers);
//        bubbleArraySorting(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(sortiert));
//        mergeSort(numbers,0, numbers.length );
//        System.out.println(Arrays.toString(numbers));

    }

    public static void mergeSort(int[] numbers, int start, int end) {

        if (end - start > 1) {
            int middle = start + (end - start) / 2;

            mergeSort(numbers, start, middle);
            mergeSort(numbers, middle, end);

            int[] result = mergeProzess(numbers, start, middle, end);
            for (int i = 0; i < result.length; i++) {
                numbers[start + i] = result[i];
            }
        }

    }

    public static int[] mergeProzess(int[] numbers, int start, int middle, int end) {
        int[] result = new int[end - start];
        int indexResult = 0;
        int indexLeft = start;
        int indexRight = middle;
        while (indexResult < result.length) {
            if ((indexRight == end) || (indexLeft < middle) && (numbers[indexLeft] < numbers[indexRight])) {
                result[indexResult] = numbers[indexLeft];
                indexResult++;
                indexLeft++;
            } else {
                result[indexResult] = numbers[indexRight];
                indexResult++;
                indexRight++;
            }
        }
        return result;
    }


    public static int[] selectionSorting(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[index] > numbers[j]) {
                    index = j;
                }
            }
            int tmp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = tmp;
        }
        return numbers;
    }

    public static void arraySortingAbsoluteValue(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (Math.abs(numbers[j]) > Math.abs(numbers[j + 1])) {
                    int tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }

        }
    }

    public static void bubbleArraySorting(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }

        }
    }
}

