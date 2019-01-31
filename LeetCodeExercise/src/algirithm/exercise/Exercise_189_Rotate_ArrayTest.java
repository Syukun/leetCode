package algirithm.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise_189_Rotate_ArrayTest {

	@Test
	void test() {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums,k);
		
	}
	
	public void rotate(int[] nums, int k) {
		int size = nums.length - k;
		int[] tmp = new int[size];
		for(int i = 0 ; i < size ; i++) {
			tmp[i] = nums[i];
		} 
		
		for(int i = 0 ; i < k ; i++) {
			nums[i] = nums[i+size];
		}
		for(int i = k ; i < nums.length ; i++) {
			nums[i] = tmp[i-k];
		}
	}

}
