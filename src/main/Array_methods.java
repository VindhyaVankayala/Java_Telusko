package main;

import java.util.Arrays;

public class Array_methods {
	
	public static void main(String[] args) {
		
		double[][] arr = new double[3][2];
		System.out.println(arr.getClass().getName());
		String[] str = {"vindhya"};
		int a[] = {2,4,1,4,9,17,27};
		
		for(int i:a)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(a);
		
		System.out.println("After sorting:");
		
		for(int i:a)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		int pos = Arrays.binarySearch(a,29);
		System.out.println(pos);
	}

}
