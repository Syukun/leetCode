package linkedList.tutorial;

public class Solution {
	public static String breakBrace(String str) throws Exception {
		String res = "";
		int rightBraceIndex=0;
		try {
			rightBraceIndex = str.indexOf("}");
		}catch(Exception e) {
			throw new Exception("Need right brace");
		}
		if(rightBraceIndex==1) {
			res = str.substring(rightBraceIndex+1);
		}else {
			String strInBrace = str.substring(1, rightBraceIndex);
			String strOutBrace = str.substring(rightBraceIndex+1);
			String[] strsInBrace = strInBrace.split(",");
			
			for(String s : strsInBrace) {
				res += (s+strOutBrace+" ");
			}
		}
		
		return res;
	}

	// test
	public static void main(String[] args) throws Exception {
		System.out.println(breakBrace("{aa,bb,cc}dd"));
		System.out.println(breakBrace("{aa,bb,cc}"));
		System.out.println(breakBrace("{}d"));
	}
}
