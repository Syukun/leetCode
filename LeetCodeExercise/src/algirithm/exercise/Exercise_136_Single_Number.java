package algirithm.exercise;

import java.util.HashSet;
import java.util.Set;

public class Exercise_136_Single_Number {
	public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int i=0;
        while(i<nums.length){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
            i++;
        }
        return (int) set.toArray()[0];
    }
	
	/*
	 * 
	 * Solution 2: Use XOR
	 * 
	 * a ^ 0 = a;
	 * a ^ a = 0;
	 */
}
