package LeetCode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 1614
public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        char[] arr = s.toCharArray();
        Deque<Character> dq = new ArrayDeque<>();
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < arr.length; i ++ ){
            if(arr[i] == '(') count ++;
            if(arr[i] == ')') count --;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
