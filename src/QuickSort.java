import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {12, 21, 2, 15, 375, 1, -5};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

    }
    static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    static int partition(int arr[], int begin, int end) {
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= arr[end]) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

}
