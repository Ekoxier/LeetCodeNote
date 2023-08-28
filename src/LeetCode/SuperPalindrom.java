package LeetCode;

public class SuperPalindrom {
    public int superpalindromesInRange(String left, String right) {
        Long leftLong = Long.valueOf(left);
        Long rightLong = Long.valueOf(right);
        int ans = 0;
        for(int k = 0; k <= 100000; k ++) {
            String kStr = String.valueOf(k);
            String pldEven = kStr + new StringBuilder(kStr.substring(0, kStr.length())).reverse();
            if(judge(leftLong,rightLong,Long.valueOf(pldEven)) == 1) ans ++;
            String pldOdd = kStr + new StringBuilder(kStr.substring(0, kStr.length() - 1)).reverse();
            if(judge(leftLong,rightLong,Long.valueOf(pldOdd)) == 1) ans ++;
            if(judge(leftLong,rightLong,Long.valueOf(pldOdd)) == -1) break;
        }
        return ans;
    }
    public int judge(Long left, Long right, Long pld) {
        Long pldSqr = pld * pld;
        if(isPalindrome(pldSqr) && pldSqr <= right && pldSqr >= left) return 1;
        if(pldSqr > right) return -1;
        return 0;
    }
    public boolean isPalindrome(long x) {
        return x == reverse(x);
    }

    public long reverse(long x) {
        long ans = 0;
        while(x > 0) {
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }
}
