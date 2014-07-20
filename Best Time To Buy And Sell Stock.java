    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int profit = (-1)*prices[0];
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            min = Math.min(prices[i],min);
            profit = Math.max(prices[i]-min,profit);
        }
        return profit;
    }