package LeetCode.Stack;

import java.util.*;


public class Operation {

    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        Deque<Integer> dq = new ArrayDeque<>();
        int num = 0;
        char preSign = '+';
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (Character.isDigit(chr)) {
                num = num * 10 + (chr - '0');
                if (i != s.length() - 1) continue;
            }
            switch (preSign) {
                case '+':
                    dq.addFirst(num);
                    break;
                case '-':
                    dq.addFirst(-num);
                    break;
                case '*':
                    dq.addFirst(dq.removeFirst() * num);
                    break;
                case '/':
                    dq.addFirst(dq.removeFirst() / num);
                    break;
            }
            preSign = chr;
            num = 0;
        }
        int res = 0;
        while (!dq.isEmpty()) {
            res += dq.removeFirst();
        }
        return res;
    }
}
