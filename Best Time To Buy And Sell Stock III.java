//http://www.tuicool.com/articles/U7Nvme
public static int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int min=prices[0];
        int max=prices[prices.length-1];
        
        int maxprofit=0;
        int [] left = new int[prices.length];
        int [] right = new int[prices.length];
        
        left[0] = 0;
        right[prices.length-1] = 0;
        
        for (int i = 1; i < prices.length; i++) {
          left[i] = Math.max(left[i-1], prices[i] - min);
          min = Math.min(min, prices[i]);
        }
        
        for (int i = prices.length-2; i>=0; i--) {
          right[i] = Math.max(right[i+1], max - prices[i]);
          max = Math.max(max, prices[i]);
        }
        
        for (int i=0; i<prices.length;i++) {
          maxprofit=Math.max(maxprofit, left[i]+right[i]);
        }
        return maxprofit;
    }