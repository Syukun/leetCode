package algirithm.exercise;

public class Exercise_28 {

	public static int strStr(String haystack, String needle) {
		int hay_len = haystack.length();
		int needle_len = needle.length();
		for (int i = 0; i <= hay_len - needle_len; i++) {
			String sub = haystack.substring(i, i + needle_len);
			if (sub.equals(needle)) {
				return i;
			}

		}
		return -1;
	}
	
	public static void main(String[] args) {
	}

}
