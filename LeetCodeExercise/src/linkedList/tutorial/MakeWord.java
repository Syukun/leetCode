package linkedList.tutorial;

import java.util.Vector;

public class MakeWord {

	static String[] letter = new String[] {"あ","い","う","ん","ー"};
	static String[] letter_case1 = new String[] {"あ","い","う"};
	static String[] letter_case2_sub = new String[] {"あ","い","う","ん"};
	
	public static Vector<String> makeWords(){
		Vector<String> res = new Vector<String>();
		// case 1 : first letter is あ　い　う
		Vector<String> strsInDepthFour_case1 = makeWords(4);
 		for(String str_case1 : letter_case1) {
			for(String strInDepthFour : strsInDepthFour_case1) {
				res.add(str_case1 +  strInDepthFour);
			}
		}
		// case 2 : first letter is ん
		Vector<String> strsInDepthFour_case2 = makeWordsCaseTwo(4);
		for(String strInDepthFour_case2 : strsInDepthFour_case2) {
			res.add("ん" + strInDepthFour_case2);
			// case 3 : first letter is　ー
			if(!strInDepthFour_case2.startsWith("ー")) {
				res.add("ー"+strInDepthFour_case2);
			}
		}
		
		return res;
		
		
	}
	
	public static Vector<String> makeWordsCaseTwo(int i) {
		Vector<String> res = new Vector<String>();
		if(i == 1) {
			for(String str : letter) {
				res.add(str);
			}
		}else {
			for(String strInDepthMinusOne : makeWordsCaseTwo(i-1)) {
				if(strInDepthMinusOne.startsWith("ー")) {
					for(String str_case2_sub : letter_case2_sub) {
						res.add(str_case2_sub + strInDepthMinusOne);
					}
				}else {
					for(String str : letter) {
						res.add(str + strInDepthMinusOne);
					}
				}
			}
		}
		return res;
	}

	public static Vector<String> makeWords(int i){
		Vector<String> res = new Vector<String>();
		if(i == 1) {
			for(String str : letter) {
				res.add(str);
			}
		}else {
			for(String str : letter) {
				for(String strDepthMinusOne : makeWords(i-1)) {
					res.add(str + strDepthMinusOne);
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> test = makeWords();
	}

}
