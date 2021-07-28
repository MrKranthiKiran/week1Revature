package regex;

public class Secure_or_not {
	
	public static void main(String[] args) {
		securityCheck("https://www.cricbuzz.com");
		securityCheck("https://github.com/MrKranthiKiran/week1Revature");
		securityCheck("https://revature.zoom.us/w/99049305236?tk=PcHMWPQWKOxc5xtw7pyOqx7ped-JRn6az-bJtx23qis.DQIAAAAXD8x0lBY2YndjcDlkalJkQ24tNUtyWjE3QVFRAAAAAAAAAAAAAAAAAAAAAAAAAAAA#success");
	}
	
	public static void securityCheck(String url) {
		String[] urlSplitted = url.split(":");
		String checker = urlSplitted[0];
		
		if(checker.equals("https")) {
			System.out.println("website is secure");
		} else if(checker.equals("http")){
			System.out.println("Website is not secure");
		} else {
			System.out.println("Please enter a valid website");
		}
		
		
	}

}
