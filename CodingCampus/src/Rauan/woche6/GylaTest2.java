package Rauan.woche6;

public class GylaTest2 {
    public static void main(String[] args) {
        int[] arr = {0, 34, 5, 7, 890, 9, 87, 5, 3};
        System.out.println(getFirstAndLast(arr));

        System.out.println("printMinValue");
        printMinValue(arr);

        System.out.println("printMaxValue");
        printMaxValue(arr);

    }

    private static String getFirstAndLast(int[] arr) {
        return "First Element is: " + arr[0] + " Last Element is: " + arr[arr.length - 1];

    }

    private static void printMinValue(int[] value) {
        int idxMinValue = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] < value[idxMinValue]) {
                idxMinValue = i;
            }
        }
        System.out.println("On Index " + idxMinValue + " is: " + value[idxMinValue]);
    }

    private static void printMaxValue(int[] value) {
        int idxMaxValue = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > value[idxMaxValue]) {
                idxMaxValue = i;
            }
        }
        System.out.println("On Index " + idxMaxValue + " is: " + value[idxMaxValue]);
    }
}
