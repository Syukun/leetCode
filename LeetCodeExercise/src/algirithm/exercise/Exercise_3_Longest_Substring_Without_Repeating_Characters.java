package algirithm.exercise;
 
import java.util.HashMap;
import java.util.Map;

public class Exercise_3_Longest_Substring_Without_Repeating_Characters {

	/*
	 * Given a string, find the length of the longest substring without repeating characters.
	 * 
	 */
	
	public static int lengthOfLongestSubstring(String s) {
		if(s==null || s.length() == 0) return 0;
		Map<Character,Integer> dict = new HashMap<Character,Integer>();
		int res = 0;
		for(int i = 0 , j = 0; i < s.length() ; i++) {
			if(dict.containsKey(s.charAt(i))) {
				
				res = Math.max(i-j+1, res);
			}else {
				dict.put(s.charAt(i), i);
			}
		}
		
        return res;
    }
	
	public static void main(String[] args) {
		int res = lengthOfLongestSubstring(" ");
		System.out.println(res);
	}
}
