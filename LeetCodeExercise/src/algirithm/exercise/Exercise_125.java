package algirithm.exercise;

public class Exercise_125 {

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int len = s.length();
		
		for(int i = 0 ; i < len ; i++) {
			char i_char = s.charAt(i);
			if(Character.isLetterOrDigit(i_char)) {
				for(int j = len-1 ; j > i ; j--) {
					char j_char = s.charAt(j);
					if(Character.isLetterOrDigit(j_char)) {
						String sub = s.substring(i+1, j);
						return (i_char == j_char)? isPalindrome(sub):false;
					}
				}
			}
		}

		return true;
	}
	
	public static void main(String[] args) {
		String s = "AmanplancanalPanama";
		String sub = s.substring(1, 18);
		boolean b = isPalindrome("0P");
		System.out.print(b);
	}

}
