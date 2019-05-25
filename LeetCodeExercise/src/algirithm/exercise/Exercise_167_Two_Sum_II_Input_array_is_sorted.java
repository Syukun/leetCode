package algirithm.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
* @author Archer Shu
* @date 2019/05/24
*/
public class Exercise_167_Two_Sum_II_Input_array_is_sorted {
	
    public int[] twoSum(int[] numbers, int target) {
    	
    	int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 1; i <= numbers.length; i++){
            if(map.containsKey(target-numbers[i-1])){
                res[0] = map.get(target-numbers[i-1]);
                res[1] = i;
            }
            map.put(numbers[i-1],i);
        }
        
        return res;
        
    }
	
    
    @Test
    public void test() {
    	int[] numbersOne = {2,7,11,15};
    	int target = 9;
    	assertEquals(twoSum(numbersOne,target),0);
    	
    }
}

