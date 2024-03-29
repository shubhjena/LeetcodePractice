package Arrays;

//122. Best Time to Buy and Sell Stock II
/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.
 */
public class BestTimeToBuyAndSellStockII {
    static int maxProfit(int[] prices) {
        int profit=0, size=prices.length;
        for (int i = 1; i < size; i++) {
            if (prices[i]>prices[i-1])
                profit += (prices[i] - prices[i-1]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
