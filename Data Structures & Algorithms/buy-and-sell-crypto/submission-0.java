class Solution {
    public int maxProfit(int[] prices) {
        int sell = prices[0], buy = 0;
        for(int i=1;i<prices.length;i++){
            sell = Math.min(sell, prices[i]);
            buy = Math.max(buy, prices[i]-sell);
        }
        return buy;
    }
}
