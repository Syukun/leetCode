package algirithm.exercise;

public class Exercise_125 {

	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int len = s.length();
		
		for(int i = 0 ; i < len ; i++) {
			char i_char = s.charAt(i);
			if(i_char >= 'a' && i_char <= 'z') {
				for(int j = len-1 ; j > i ; j--) {
					char j_char = s.charAt(j);
					if(j_char >= 'a' && j_char <= 'z') {
						return (i_char == j_char)? isPalindrome(s.substring(i+1, j-1)):false;
					}
				}
			}
		}

		return true;
	}

}
