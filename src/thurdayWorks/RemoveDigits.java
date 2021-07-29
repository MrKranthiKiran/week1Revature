package thurdayWorks;

import java.util.Arrays;

public class RemoveDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		remove(121,232,422,434,554,632);

	}
	
	public static void remove(int ...num) {
		int n = num.length;
		int temp[] = new int[n];
		int j=0;
		
		
		for (int i = 0; i < num.length; i++) {
			StringBuffer s1 = new StringBuffer(Integer.toString(num[i]));
			
			char l1 = s1.charAt(0);
			char l2 = s1.charAt(s1.length()-1);
			
			
			
			if(l1 != l2) {
				
				temp[j++] = num[i];
			    
			}
		}
		
		int sol[] = new int[j];
		for(int k=0; k<j; k++) {
			sol[k] = temp[k];
		}
		
		// System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(sol));
	}

}
