package project;

import java.util.Arrays;

public class nthLargestUsingSort {
	public static void main(String[] args) {
		int []a= {10,3,5,20,50,60};
		int n=6;
		Arrays.sort(a);
		
		System.out.println( n + " Largest is : ");
		System.out.println(a[a.length-n]);
	}

}
