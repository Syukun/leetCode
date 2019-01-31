package algirithm.exercise;

public class Exercise_283_Move_Zeros {
	public void moveZeroes(int[] nums) {
        int[] tmp = new int[nums.length];
        for(int i = 0, j = 0; i < nums.length; i++){
            if(nums[i] != 0){
                tmp[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i < nums.length ; i++){
            nums[i] = tmp[i];
        }
    }
}
