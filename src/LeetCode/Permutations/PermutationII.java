package LeetCode.Permutations;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.cn/problems/permutation-ii-lcci/
public class PermutationII {

    public String[] permutation(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
            else map.put(arr[i], 1);
        }
//        ArrayList
//        map.keySet().forEach();
        return null;
    }

}
