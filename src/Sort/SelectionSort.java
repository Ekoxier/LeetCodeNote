package Sort;

public class SelectionSort {
    // Select the largest to the end;
    public static void selectionSort(int[] array) {
        int end = array.length - 1;
        while (end != 0) {
            int maxIdx = end;
            for (int i = 0; i <= end; i++) {
                maxIdx = array[i] > array[maxIdx] ? i : maxIdx;
            }
            int tmp = array[maxIdx];
            array[maxIdx] = array[end];
            array[end] = tmp;
            end--;
        }
    }
}
