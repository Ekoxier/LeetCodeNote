package Sort;

public class QuickSort {
    public static void quickSort(int[] array, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivotLoc = partition(array, start, end);
        quickSort(array, start, pivotLoc - 1);
        quickSort(array, pivotLoc + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
//        while()
        int pivot = array[start];
        while(start < end) {
            while(start < end && pivot <= array[end]) end --;
            array[start] = array[end];

            while(start < end && pivot >= array[start]) start ++;
            array[end] = array[start];
        }
        array[start] = pivot;
        return start;
    }
}
