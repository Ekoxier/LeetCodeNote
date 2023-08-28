package LeetCode;

import java.util.*;

public class UglyNumber {
    public int nthUglyNumberOfficial(int n) {
        int[] factors = {2, 3, 5};
        Set<Long> seen = new HashSet<Long>();
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long curr = heap.poll();
            ugly = (int) curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }

    public int nthUglyNumber(int n) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        minHeap.add(1L);

        while (!minHeap.isEmpty()) {
            long tmp = minHeap.poll();
            set.add(tmp);
            if (set.size() == n) return (int) tmp;
            if (!set.contains(tmp * 2)) minHeap.add(tmp * 2);
            if (!set.contains(tmp * 3)) minHeap.add(tmp * 3);
            if (!set.contains(tmp * 5)) minHeap.add(tmp * 5);
        }
        return 1;
    }

    public int nthUglyNumberDP(int n) {
        int p2 = 1, p3 = 1, p5 = 1;
        int[] dp = new int[n + 1];
        for (int i = 1; i < dp.length; i++) {
            if (i == 1) {
                dp[i] = 1;
                continue;
            }
            int p2v = dp[p2] * 2;
            int p3v = dp[p3] * 3;
            int p5v = dp[p5] * 5;
            dp[i] = Math.min(Math.min(p2v, p3v), p5v);
            if (dp[i] == p2v) p2++;
            if (dp[i] == p3v) p3++;
            if (dp[i] == p5v) p5++;
        }
        return dp[n];
    }

}
