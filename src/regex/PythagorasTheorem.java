package regex;



public class PythagorasTheorem {
	
	public static void main(String[] args) {
		System.out.println(calculateA(3, 4));
		System.out.println(calculateA(10, 12));
	}
	
	public static double calculateA(int b, int c) {
		double a = (Math.pow(b,2)) + (Math.pow(b,2));
		a=Math.sqrt(a);
		a=Math.ceil(a);
		return a;
	}

}
