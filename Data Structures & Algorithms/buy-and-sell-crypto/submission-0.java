class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0], bestSoFar = 0;
        for (int i = 1; i <= prices.length - 1; i ++){
            minSoFar = Math.min(minSoFar, prices[i]);
            bestSoFar = Math.max(bestSoFar, prices[i] - minSoFar);
        }
        return bestSoFar;
    }
}
