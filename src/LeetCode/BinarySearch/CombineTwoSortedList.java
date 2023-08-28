package LeetCode.BinarySearch;

import java.util.List;

public class CombineTwoSortedList {
    public static int[] combineTwoSortedList(int[] lista, int[] listb) {
        int[] res = new int[lista.length + listb.length];
        int aIdx = 0;
        int bIdx = 0;
        int resIdx = 0;
        while(true){
            if(aIdx == lista.length) {
                while(bIdx != listb.length) {
                    res[resIdx] = listb[bIdx];
                    bIdx++;
                    resIdx++;
                }
                break;
            }
            if(bIdx == listb.length) {
                while(aIdx != lista.length) {
                    res[resIdx] = lista[aIdx];
                    aIdx++;
                    resIdx++;
                }
                break;
            }

            if(lista[aIdx] <= listb[bIdx]) {
                res[resIdx] = lista[aIdx];
                aIdx ++;
                resIdx ++;
            } else {
                res[resIdx] = listb[bIdx];
                bIdx ++;
                resIdx ++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,5,7,9};
        int[] b = new int[]{1,2,3,4,5};
        int[] res = combineTwoSortedList(a,b);
        return;
    }
}
