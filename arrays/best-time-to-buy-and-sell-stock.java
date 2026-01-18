class Solution {
    public int maxProfit(int[] prices) {
      int minima = prices[0];
      int profit = 0;
      for(int i = 0; i < prices.length; i++) {
        minima = Math.min(minima, prices[i]);
        profit = Math.max(prices[i] - minima, profit);
      }
      return profit;
    }
}
