package thurdayWorks;

public class ReversePalindrome {
	
	public static void main(String[] args) {
		
		System.out.println(reverse("abcba"));
		System.out.println(reverse("abcdef"));
		
	}
	
	public static String reverse(String word) {
		
		StringBuilder sb=new StringBuilder(word);
		sb.reverse();
		String s1=sb.toString();
		
		if(word.equals(s1)) {
			return "Palindrome";
		} else {
			return s1.toString();
		}
		
	}

}
