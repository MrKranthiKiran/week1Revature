package regex;


public class Website {
	
	
	
	public static void main(String[] args) {
		
//		String url = "https://www.javatpoint.com/substring";
		extractDomain("https://www.tutorialspoint.com/How-to-print-data-of-specific-element-from-an-array-in-java");
		extractDomain("https://en.wikipedia.org/wiki/Main_Page");
		
		
		
//		String[] websiteSplitted = url.split("/");
//		System.out.println(websiteSplitted[2]);

	}
	
	public static void extractDomain(String url) {
		
		String[] websiteSplitted = url.split("/");
		System.out.println(websiteSplitted[2]);
		
		
		
	}

}
