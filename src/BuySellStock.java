import java.util.Arrays;

public class BuySellStock {

    public int maxProfit(int[] prices) {

        System.out.println(Arrays.toString(prices));

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int singleProfit = prices[i + 1] - prices[i];
            if (singleProfit > 0) {
                profit += singleProfit;
            }
        }

        return profit;

    }

}
