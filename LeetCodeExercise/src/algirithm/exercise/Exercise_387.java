package algirithm.exercise;

import java.util.HashMap;
import java.util.Map;

public class Exercise_387 {

	public int firstUniqChar(String s) {
        int len = s.length();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0 ; i < len ; i++){
        	char char_i = s.charAt(i);
            if(map.containsKey(char_i)){
            	map.put(char_i, map.get(char_i)+1);
            }else {
            	map.put(char_i, 1);
            }
        }
        for(int i = 0 ; i < len ; i++) {
        	if(map.get(s.charAt(i))==1) {
        		return i;
        	}
        }
        
        return -1;
    }
	
}
