package LeetCode.DP;

public class LongestPalindrome {
    public int getLongestPalindrome (String A) {
        // write code here
        int left = 0;
        int right = 0;
        char[] arr = A.toCharArray();
        int[] dp = new int[arr.length + 1];
        dp[1] = 1;
        if (arr.length == 1) return 1;
        int idx = 1;
        while(true){
            dp[idx] = dp[idx - 1];
        }
//        return 0;
    }
    public boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString() == str;
    }
}
