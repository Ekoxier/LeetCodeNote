package LeetCode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> dq = new ArrayDeque<>();
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!dq.isEmpty() && heights[dq.peekLast()] > heights[i]) {
                int h = heights[dq.removeLast()];
                int area = dq.isEmpty() ? h * i : h * (i - dq.peekLast() - 1);
                res = Math.max(res, area);
            }
            dq.addLast(i);
            int a = 0;
        }

        while(!dq.isEmpty()){
            int h = heights[dq.removeLast()];
            int area = dq.isEmpty() ? h * heights.length : h * (heights.length - dq.peekLast() - 1);
            res = Math.max(res, area);
        }
        return res;
    }
}
