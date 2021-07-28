package regex;

public class WithRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validateDL("HR-0619850034761"));
		System.out.println(validateDL("UP14 20160034761"));
		System.out.println(validateDL("MH27 30123476102"));
		
		
		System.out.println(debitCard("1234 2324 4353 3421"));
		System.out.println(debitCard("11asddss adafafafaf aefdafaf afdaf"));
		
		

	}
	
	public static boolean validateDL(String dl) {
		return dl!=null && dl.matches("(([A-Z]{2}[0-9]{2})( )|([A-Z]{2}-[0-9]{2}))((19|20)[0-9]{2})[0-9]{7}");
	}
	
	public static boolean debitCard(String debit) {
		return debit!=null && debit.matches("([0-9]{4})" + " " + "([0-9]{4})" + " " + "([0-9]{4})" + " " + "([0-9]{4})");
	}

}
