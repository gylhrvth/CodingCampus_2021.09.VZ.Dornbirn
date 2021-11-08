package danny.sortMethods;

public class mergeSort {
    public static void main(String[] args) {

        int[] testData = {4, 6, 1 , -4, -8, 12, 2, -3, -10};

    }

    public static void mergeSort(int[] data, int start, int end) {
        if ( end - start > 1) {
            int middle = start + (end - start)/2;

            mergeSort(data, start, middle);
            mergeSort(data, middle, end);
            
        }

    }
}
