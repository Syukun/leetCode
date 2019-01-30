package algirithm.exercise;
 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise_3_Longest_Substring_Without_Repeating_Characters {

	/*
	 * Given a string, find the length of the longest substring without repeating characters.
	 * 
	 */
	
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (j < n) {
           if(set.contains(s.charAt(j))) {
        	   set.remove(s.charAt(i++));
           }else {
        	   set.add(s.charAt(j++));
        	   ans = Math.max(ans, j-i);
           }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int res = lengthOfLongestSubstring("abab");
		System.out.println(res);
	}
}
