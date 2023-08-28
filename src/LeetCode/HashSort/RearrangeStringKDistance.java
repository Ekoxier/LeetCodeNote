package LeetCode.HashSort;

import java.util.*;

public class RearrangeStringKDistance {
    public String stringKDistance(String s, int k) {
        char[] strArr = s.toCharArray();
        int[] alp = new int[26];
        for(char chr: strArr) {
            alp[chr - 'a'] ++;
        }
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.count == o2.count ? o1.count - o2.count : o1.chr - o2.chr;
            }
        });
        for(int i = 0; i < 26; i ++) {
            if (alp[i] != 0) {
                pq.add(new Node((char) ('a' + i), alp[i]));
            }
        }
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            ArrayList<Node> list = new ArrayList<>();
            for(int i = 0; i < Math.min(k, len); i ++) {
                if(pq.isEmpty()) return "";
                Node node = pq.poll();
                node.count --;
                sb.append(node.chr);
                if (node.count > 0) list.add(node);
                len--;
            }
            for(Node node: list) {
                pq.add(node);
            }
        }
        return sb.toString();
    }
    class Node {
        char chr;
        int count;
        Node(char chr, int count){
            this.chr = chr;
            this.count = count;
        }
    }
}

