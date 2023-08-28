package Sort;

public class SortTest {
    public static void main(String[] args) {
        int[] array = new int[]{47,24,19,55,70,3,100,5};
//        QuickSort.quickSort(array,0,array.length - 1);
//        SelectionSort.selectionSort(array);
        BubbleSort.bubbleSort(array);
        System.out.print(array);

    }
}
