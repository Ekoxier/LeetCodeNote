package LeetCode.BackTrack;

import java.util.*;

class NQueens {
    private List<List<String>> solutions;
    private Set<Integer> columns;
    private Set<Integer> diagonals1;
    private Set<Integer> diagonals2;

    public List<List<String>> solveNQueens(int n) {
        this.solutions = new ArrayList<>();
        this.columns = new HashSet<>();
        this.diagonals1 = new HashSet<>();
        this.diagonals2 = new HashSet<>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        backtrack(queens, n, 0);
        return solutions;
    }

    private void backtrack(int[] queens, int n, int row) {
        if (row == n) {
            List<String> board = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                char[] rowDisplay = new char[n];
                Arrays.fill(rowDisplay, '.');
                rowDisplay[queens[i]] = 'Q';
                board.add(new String(rowDisplay));
            }
            solutions.add(board);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (columns.contains(i)) {
                continue;
            }
            if (diagonals1.contains(row - i)) {
                continue;
            }
            if (diagonals2.contains(row + i)) {
                continue;
            }
            columns.add(i);
            diagonals1.add(row - i);
            diagonals2.add(row + i);
            queens[row] = i;
            backtrack(queens, n, row + 1);
            queens[row] = -1;
            columns.remove(i);
            diagonals1.remove(row - i);
            diagonals2.remove(row + i);
        }
    }
}
