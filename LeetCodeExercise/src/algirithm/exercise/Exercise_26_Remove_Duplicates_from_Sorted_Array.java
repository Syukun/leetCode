package algirithm.exercise;

public class Exercise_26_Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
		int j = 0;
		int length = nums.length;
		if (length > 0) {
			for(int i = 1 ; i < length ; i++) {
				if(nums[i] != nums[j]) {
					j++;
					nums[j] = nums[i];
				}
			}
		}else {
			return 0;
		}
		return j+1;

	}
}
