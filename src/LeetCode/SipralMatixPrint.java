package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SipralMatixPrint {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[][] matrixT = new int[matrix[0].length][matrix.length];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col ++){
                matrixT[col][row] = matrix[row][col];
            }
        }

        List<Integer> ans = new ArrayList<>();
        int iRightBound = matrixT.length - 1;
        int iLeftBound = 0;
        int jDownBound = matrixT[0].length - 1;
        int jUpBound = 0;

        int i = 0;
        int j = 0;
        int[] right = new int[]{1, 0};
        int[] down = new int[]{0, 1};
        int[] left = new int[]{-1, 0};
        int[] up = new int[]{0, -1};
        int[][] directions = new int[][]{right, down, left, up};
        int idx = 0;
        ans.add(matrixT[0][0]);
        while (ans.size() != matrixT.length * matrixT[0].length) {
            int[] dir = directions[idx % 4];
            while (i + dir[0] >= iLeftBound
                    && i + dir[0]<= iRightBound
                    && j + dir[1] <= jDownBound
                    && j + dir[1] >= jUpBound) { // Not meet the bounds
                i += dir[0];
                j += dir[1];
                ans.add(matrixT[i][j]);
            }
            if (idx % 4 == 0) {
                jUpBound++;
            }
            if (idx % 4 == 1) {
                iRightBound--;
            }
            if (idx % 4 == 2) {
                jDownBound--;
            }
            if (idx % 4 == 3) {
                iLeftBound++;
            }
            idx++;
        }
        return ans;
    }
}
