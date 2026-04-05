package main;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array you want: "
				+ "");
		int n = sc.nextInt();
		int[] id = new int[n];
		
		System.out.println("Enter the array input values: ");
		
		for(int i=0;i<n;i++)
		{
			id[i] = sc.nextInt();
		}
		
		System.out.println("the array is: ");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(id[i] + " ");
		}
	}

}
