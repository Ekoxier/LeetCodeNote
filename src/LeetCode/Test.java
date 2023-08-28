package LeetCode;

import LeetCode.Stack.Operation;
import LeetCode.Stack.TrainInOut;

import java.util.*;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        "sdsd".charAt(1)
        while (in.hasNextInt()) {
            PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> {
                int idx = 0;
                while (idx < o1.length() && idx < o2.length()) {
                    if (o1.charAt(idx) != o2.charAt(idx)) return o1.charAt(idx) - o2.charAt(idx);
                    idx++;
                }
                return o1.length() - o2.length();
            });
            int num = in.nextInt();
            for(int i = 0 ; i < num; i ++) {
                pq.add(in.next());
            }
            while (!pq.isEmpty()) {
                System.out.println(pq.poll());
            }
        }

    }
}