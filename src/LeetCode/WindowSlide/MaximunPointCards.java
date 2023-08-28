package LeetCode.WindowSlide;

class MaximunPointCards {
    int ans = 0;

    public int maxScore(int[] cardPoints, int k) {
        recur(cardPoints, 0, k, 0 , cardPoints.length - 1);
        return ans;
    }

    public void recur(int[] cardPoints, int sum, int kRemains, int start, int end) {
        if (kRemains == 0) {
            ans = Math.max(ans, sum);
            return;
        }
        recur(cardPoints, sum + cardPoints[start],kRemains - 1, start + 1, end);
        recur(cardPoints, sum + cardPoints[end],kRemains - 1,start, end - 1);
    }
}