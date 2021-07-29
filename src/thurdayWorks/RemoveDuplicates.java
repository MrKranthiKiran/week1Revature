package thurdayWorks;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		System.out.println(removeDup(5));
	}
	
	public static String removeDup(int n) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + n + " elements");
		
		int a[] = new int[n];
		
		for (int k=0; k<n; k++) {
			
			a[k]=sc.nextInt();
			
		}
		
		Arrays.sort(a);
		
		int temp[] = new int[n];
		int j=0;
		
		for (int i=0; i<n-1; i++) {
			if(a[i] != a[i+1]) {
				
				temp[j++]=a[i];
			}
			
		}
		temp[j++] = a[n-1];
		
		int sortedArray[] = new int[j];
		
		for (int i=0; i<j; i++) {
			sortedArray[i]=temp[i];
		}
		
		//System.out.println(temp.length);
		
		
		
		return Arrays.toString(sortedArray);
		
		
		
		
		
	}

}
