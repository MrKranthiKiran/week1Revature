package thurdayWorks;

import java.util.Arrays;
import java.util.Scanner;

public class NthMaxTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(nthMax(10));

	}
	
	public static int nthMax(int n) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + n + " elements : ");
		
		int a[] = new int[n];
		
		for (int k=0; k<n; k++) {
			
			a[k]=sc.nextInt();
			
		}
		
		Arrays.sort(a);
		
		System.out.println("Enter the nth highest number : ");
		int number = sc.nextInt();
		
		int temp[] = new int[n];
		int j=0;
		
		for (int i=0; i<n-1; i++) {
			if(a[i] != a[i+1]) {
				
				temp[j++]=a[i];
			}
			
		}
		temp[j++] = a[n-1];
		
		int dupRemovedArray[] = new int[j];
		
		for (int i=0; i<j; i++) {
			dupRemovedArray[i]=temp[i];
		}
		
		//System.out.println(temp.length);
		
		System.out.println(Arrays.toString(dupRemovedArray));
		
		return dupRemovedArray[dupRemovedArray.length-number];
		

	}

}
