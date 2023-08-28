package LeetCode.WindowSlide;

import java.util.HashSet;
import java.util.Set;

public class MinSubstring {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int right = 0;
        int ans = 0;
        if(chars.length == 0) return 0;
        for (int l = 0; l < chars.length; l ++ ){
            if(l == 0) {
                set.add(chars[l]);
            }
            while(right < chars.length - 1 && !set.contains(chars[right + 1])){
                set.add(chars[++ right]);
            }
            ans = Math.max(ans, set.size());
            set.remove(chars[l]);
        }
        return ans;
    }
}