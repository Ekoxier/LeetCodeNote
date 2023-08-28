package LeetCode.BinarySearch;

public class MedianOfTwoSortedList {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1.length + nums2.length) % 2 == 1) {
            return getKthElement(nums1, nums2, (nums1.length + nums2.length + 1) / 2);
        } else {
            double a = getKthElement(nums1, nums2, (nums1.length + nums2.length) / 2);
            double b = getKthElement(nums1, nums2, (nums1.length + nums2.length) / 2 + 1);
            return a + b / 2.0;
        }
    }

    public int getKthElement(int[] nums1, int[] nums2, int k) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int i = 0;
        int j = 0;
        int count = 0;
//        if(length1 == 0 && length2 == 2) return
        if(length1 == 0) return nums2[k - 1];
        if(length2 == 0) return nums1[k - 1];
        while (true) {
            if(i == length1) {
                return nums2[k - length1 - 1]; // ATTENTION
            }
            if(j == length2) {
                return nums1[k - length2 - 1];
            }
            if (nums1[i] <= nums2[j]) {
                i++;
                count++;
                if (count == k) {
                    return nums1[i - 1];
                }
            } else {
                j ++;
                count++;
                if (count == k) {
                    return nums2[j - 1];
                }
            }
        }
    }
}
