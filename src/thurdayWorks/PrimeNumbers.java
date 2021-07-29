package thurdayWorks;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		primeNumberCheck(2,3,4,5,6,7,8,9);
	}
	
	public static void primeNumberCheck(int ...num) {
		
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i]>1){
				for(int j=2; j<num[i];j++) {
					if(num[i]%j != 0) {
						System.out.println(num[i] + " is a prime number");
						break;
					}
					else {
						System.out.println(num[i] + " is not a prime number");
						break;
					}
				}
			}
			
			
		}
	}

}
