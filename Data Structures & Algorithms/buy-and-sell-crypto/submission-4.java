class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i: prices){
            profit=Math.max(i-buy,profit);
            buy=Math.min(i,buy);
        }
        return profit;
    }
}
