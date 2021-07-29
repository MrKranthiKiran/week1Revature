package thurdayWorks;

import java.util.Arrays;
import java.util.Scanner;

public class LastLetter {
	
	public static void main(String[] args) {
		
		System.out.println(convert());
		
	}
	
	public static String convert() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		String sentence = sc.nextLine();
		
	    String ar[] = sentence.split(" ");
	    StringBuffer upperCasedSentence = new StringBuffer();
	    for (int i = 0; i < ar.length; i++) {
			
			upperCasedSentence.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
	    
	    return upperCasedSentence.toString();
		
	}
	

}
