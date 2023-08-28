package LeetCode.Heap;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, k);
    }
    public int quickSort(int[] array, int start, int end, int k) {
        if (start >= end) {
            return array[start];
        }
        int pivotLoc = partition(array, start, end);
        if (pivotLoc == k - 1) {
            return array[pivotLoc];
        } else if (pivotLoc > k - 1) {
            return quickSort(array, start, pivotLoc - 1, k);
        } else {
            return quickSort(array, pivotLoc + 1, end, k);
        }
    }

    private int partition(int[] array, int start, int end) {
//        while()
        int pivot = array[start];
        while(start < end) {
            while(start < end && pivot >= array[end]) end --;
            array[start] = array[end];

            while(start < end && pivot <= array[start]) start ++;
            array[end] = array[start];
        }
        array[start] = pivot;
        return start;
    }
}
