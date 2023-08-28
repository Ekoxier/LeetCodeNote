package LeetCode.Greedy;

import java.util.Arrays;

public class Candies2 {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        int ascLen = 1;
        int preCandy = 1;
        int dscLen = 0;
        int ans = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                ascLen++;
                preCandy++;
                ans += preCandy;
            }
            if (ratings[i] == ratings[i - 1]) {
                ascLen = 1;
                preCandy = 1;
                ans += preCandy;
            }
            if (ratings[i] < ratings[i - 1]) {
                dscLen++;
                if (dscLen == ascLen) {
                    dscLen ++;
                }
                ans += dscLen;
//                ascLen?
            }
        }
        return 0;
    }
}
