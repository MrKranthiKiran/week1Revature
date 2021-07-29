package thurdayWorks;

import java.util.Arrays;

public class PalindromeNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindromeCheckNum(121,2,3,414,5,7);
		
		

	}
	
	
	public static void palindromeCheckNum (int ...a) {

	
		for (int i = 0; i < a.length; i++) {
			
			StringBuffer s = new StringBuffer(Integer.toString(a[i]));
			// System.out.println(a[i]);
			s = s.reverse();
			// System.out.println("s is "+s);
			String s1 = s.toString();
			//System.out.println("s1 is " +s1);
			if(s.toString().equals(s1)){
				System.out.println(a[i] + " is palindrome");
			}
			else {
				System.out.println(a[i] + " is not a palindrome");
			}
			
		}
		
		System.out.println(Arrays.toString(a));
	}

}
