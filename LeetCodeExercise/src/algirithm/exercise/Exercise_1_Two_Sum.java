package algirithm.exercise;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example :
 * 
 * 	Given nums = [2, 7, 11, 15], target = 9,
 *  Because nums[0] + nums[1] = 2 + 7 = 9, return [0,1]
 *  
 */

public class Exercise_1_Two_Sum {
	
/*
 *  Solution one :
 * 	Brute Force	枚举法
 */
	
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		for(int i = 0 ; i < nums.length ; i++) {
			for(int j = 0 ; j < nums.length ; j++) {
				if(nums[j] == target - nums[i]) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
/*
 *  Solution two:
 *  Two-Pass Hash Table
 */
	public int[] twoSum_s2(int[] nums, int target) {
		int length = nums.length;
		Map<Integer,Integer> mapping = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < length ; i++) {
			mapping.put(nums[i], i);
		}
		for(int i = 0 ; i < length ; i++) {
			int rest = target - nums[i];
			int rest_index = mapping.get(rest);
			if(mapping.containsKey(rest) && rest_index!=i) {
				return new int[] {i,rest_index};
			}
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}
	
	
/*
 * 	Solution three:
 * 	One-Pass Hash Table
 */
	public int[] twoSum_s3(int[] nums, int target) {
		int length = nums.length;
		Map<Integer,Integer> mapping = new HashMap<Integer,Integer>();
		for(int i = 0; i < length ; i++) {
			int rest = target - nums[i];
			if(mapping.containsKey(rest)) {
				return new int[] {i,mapping.get(rest)};
			}
			mapping.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}

}
