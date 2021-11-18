package Danny.recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sumRecursiv(10));
        System.out.println(product(5));

        String[] data = new String[]{"Stefan", "Mahir", "Ömer", "Array", "Gerry", "Plamena", "Sadaaq", "Sandro", "Ingo", "Stjepan", "Bartosz"};

        System.out.println(buildOutput(data));
        System.out.println(buildOutputRecursiv(data, 0));

        StringBuilder builder = new StringBuilder();
        buildOutputRecursiv(data, 0, builder);
        System.out.println(builder);

        int[] tmp = new int[1];
        sumEndRecursiv(10, tmp);
        System.out.println(tmp[0]);
    }

    public static String buildOutputRecursiv(String[] arr, int index) {
        if (index >= arr.length) {
            return "";
        }
        return arr[index] + " " + buildOutputRecursiv(arr, index + 1);
    }

    public static void buildOutputRecursiv(String[] arr, int index, StringBuilder builder) {
        if (index < arr.length) {
            builder.append(arr[index]).append(" ");
            buildOutputRecursiv(arr, index + 1, builder);
        }
    }

    public static String buildOutput(String[] arr) {
        String name = "";
        for (int i = 0; i < arr.length; i++) {
            name += arr[i] + " ";
        }
        return name;
    }

    public static int sumRecursiv(int max) {
        if (max >= 0) {
            int previousSum = sumRecursiv(max - 1);
            return previousSum + max;
        } else {
            return 0;
        }
    }

    public static void sumEndRecursiv(int max, int[] sum) {
        if (max > 0) {
            sum[0] += max;
            sumEndRecursiv(max - 1, sum);
        }
    }

    public static int product(int max) {
        if (max > 0) {
            int sum = product(max - 1);
            return sum * max;
        } else {
            return 1;
        }
    }

    public static int sum(int max) {
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
