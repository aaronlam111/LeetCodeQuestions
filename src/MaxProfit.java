public class MaxProfit {
    public static int maxProfit(int[] prices){
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j]-prices[i] > max) max = prices[j]-prices[i];
            }
        }
        return max;
    }

    public static int maxProfitNTime(int[] prices){
        int smallestNumber = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            smallestNumber = Math.min(smallestNumber, prices[i]);
            profit = Math.max(profit, prices[i]-smallestNumber);
        }
        return profit;
    }
}
