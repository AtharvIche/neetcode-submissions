class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int maxProfit = prices[0];

        for(int i = 1; i < prices.length;i++){
            int profit = prices[i] - maxProfit;
            if(profit < 0){
                profit = 0;
            }
            max = Math.max(max,profit);
            if(prices[i] < maxProfit){
                maxProfit = prices[i];
            }
        }

        return max;
    }
}
