package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class findPrime {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        for(int i = 9; i < 200000; i += 2) {
            int tmp = i;
            boolean isPrime = true;
            for(int j = 0; j < arr.size(); j ++){
                if(i % arr.get(j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) arr.add(tmp);
        }
        arr.forEach(e -> System.out.print(e + ","));
    }
}
