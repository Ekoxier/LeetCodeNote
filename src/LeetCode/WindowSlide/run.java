package LeetCode.WindowSlide;

public class run {
    public static void main(String[] args) {
//      new MinSubstring().lengthOfLongestSubstring("abcabcbb");
        int[] nums = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int[] n2 = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 2;
        System.out.print(new Logest1WithFlipK().longestOnes(nums, k));
        return;
    }
}
