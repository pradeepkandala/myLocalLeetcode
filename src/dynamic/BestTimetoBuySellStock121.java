package dynamic;

public class BestTimetoBuySellStock121 {

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.print(maxProfit);
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            } else if(maxProfit < ( prices[i] - minPrice)){
                maxProfit = prices[i] - minPrice;
            }

        }
        return maxProfit;
    }

}
