package algirithm.exercise;

public class Exercise_38 {
	
	public static String countAndSay(int n) {
        
        if(n==1) return "1";
        if(n>1) {
        	String res = "";
        	String cas_m1 = countAndSay(n-1);
        	int len = cas_m1.length();
        	int j = 1;
        	char curr = cas_m1.charAt(0);
        	
        	for(int i = 1; i < len ; i++) {
        		if(cas_m1.charAt(i) == curr) {
        			j++;
        		}else {
        			
        			res += (j+""+curr);
        			j=1;
        			curr=cas_m1.charAt(i);
        			
        		}
        		
        	}
        	res += (j+""+curr);
        	return res;
        }
        throw new IllegalArgumentException("n is 0");
    }
	

	public static void main(String[] args) {
		String s = countAndSay(5);
		System.out.println(s);
	}

}
