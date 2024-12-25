package sampleleetcode;

public class MaxProfit121 {
    public static void main(String[] args){
     int[] stocks = {7,1,5,3,6,4};
     int maxprofit = maxProfit(stocks);
     System.out.print("maxprofit : " +maxprofit);
    }
    public static int maxProfit(int[] prices) {
        int maxprofit =0;
        int minPos = prices[0];
        int maxPos = prices[prices.length-1];
        int i=0;
        while(i < prices.length && (minPos < maxPos)){

        }
        return maxprofit;
    }

}
