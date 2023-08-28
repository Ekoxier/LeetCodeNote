package LeetCode.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TrainInOut {
    Deque<Integer> dq = new ArrayDeque<>();
    List<List<Integer>> anss = new ArrayList<>();
    public List trainInOut(int[] trainSeq){
//        backTrack(new ArrayList<>(), trainSeq, 0);
        dfs(new ArrayList(),trainSeq,0);
        return anss;
    }
    // FIFO
    public void dfs(ArrayList ans, int[] trainSeq, int idx){
        if(ans.size() == trainSeq.length) {
            anss.add((ArrayList)ans.clone());
            return;
        }
        if(idx < trainSeq.length) {
            dq.addFirst(trainSeq[idx]);
            dfs(ans, trainSeq, idx + 1);
            dq.removeFirst();
        }

        if (!dq.isEmpty()) {
            int tmp = dq.removeFirst();
            ans.add(tmp);
            dfs(ans, trainSeq, idx);
            ans.remove(ans.size() - 1);
            dq.addFirst(tmp);
        };
    }
}
