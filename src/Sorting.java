public class Sorting {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        PrintArray(array);
        SortArray(array);
        PrintArray(array);

    }

    private static void SortArray(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    private static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
