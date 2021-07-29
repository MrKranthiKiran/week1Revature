package thurdayWorks;

public class OddWord {
	
	public static void main(String[] args) {
		
		System.out.println(convertMiddle("dhoni"));
		System.out.println(convertMiddle("captain"));
		System.out.println(convertMiddle("spidey"));
		System.out.println(convertMiddle("avenger"));
		
	}
	
	public static String convertMiddle(String word) {
		
		int len = word.length();
		StringBuffer s = new StringBuffer();
		if(len%2 != 2) {
			
			s.append(word.substring(0,len/2)).append(Character.toUpperCase(word.charAt((len/2)))).append(word.substring((len/2)+1,len));
			return s.toString();
		}
		
		else {
			return "the word length is even";
		}
		
		
		
	}

}
