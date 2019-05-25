package algirithm.exercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
* @author Archer Shu
* @date 2019/05/24
* 
*/
public class Exercise_122_est_time_to_buy_and_sell_stock_ii {
	
	/**
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
		int res = 0;
		for(int i = 1; i < prices.length ; i++) {
			if(prices[i] > prices [i-1]) {
				res += prices[i] - prices[i-1];
			}
		}
		return res;
	}
	
	
	@Test
	public void test() {
		int[] pricesOne = {7,1,5,3,6,4};
		assertEquals(maxProfit(pricesOne),7);
		
		int[] pricesTwo = {1,2,3,4,5};
		assertEquals(maxProfit(pricesTwo),4);
		
		int[] pricesThree = {7,6,4,3,1};
		assertEquals(maxProfit(pricesThree),0);
				
	}
}
