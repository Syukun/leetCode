package algirithm.exercise;

public class Exercise_Best_Times_to_Buy_and_Sell_Stock2 {
	public int maxProfit(int[] prices) {
		int res = 0;
		for(int i = 1 ; i < prices.length ; i++) {
			if(prices[i]>prices[i-1]) {
				res += prices[i] - prices[i-1];
			}
		}
		return res;
	}
}
