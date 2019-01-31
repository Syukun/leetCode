package algirithm.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise_26_Remove_Duplicates_from_Sorted_ArrayTest {

	@Test
	void test() {
		int i = new Exercise_26_Remove_Duplicates_from_Sorted_Array().removeDuplicates(new int[] {0,0,1,1,2});
	}

//	private int removeDuplicates(int[] nums) {
//		int j = 0;
//		int length = nums.length;
//		if (length > 0) {
//			for(int i = 1 ; i < length ; i++) {
//				if(nums[i] != nums[j]) {
//					j++;
//					nums[j] = nums[i];
//				}
//			}
//		}else {
//			return 0;
//		}
//		return j+1;
//	}

}
