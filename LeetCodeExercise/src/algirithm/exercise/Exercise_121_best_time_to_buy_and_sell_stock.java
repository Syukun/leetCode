package algirithm.exercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.<p>
 * 
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.<p>
 * 
 * Note that you cannot sell a stock before you buy one.
 *  @author Archer Shu
 *  @date 2019/05/24
*/
public class Exercise_121_best_time_to_buy_and_sell_stock {
	public int maxProfit(int[] prices) {
		int min = prices[0];
		int res = 0;
		for(int i = 1; i < prices.length ; i++) {
			if(prices[i] > prices[i-1]) {
				res = Math.max(res, prices[i]-min);
			}else {
				min = Math.min(min, prices[i]);
			}
		}
		return res;
	}
	
	@Test
	void testMaxProfit() {
		int[] pricesTestOne = {1,7,2,6,9};
		assertEquals(maxProfit(pricesTestOne),8);
		
		int[] pricesTestTwo = {4,9,1,8};
		assertEquals(maxProfit(pricesTestTwo),7);
		
		int[] pricesTestThree = {4,9,1,4};
		assertEquals(maxProfit(pricesTestThree),5);
	}
}
