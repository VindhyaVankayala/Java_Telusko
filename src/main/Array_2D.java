package main;

import java.util.Scanner;

public class Array_2D {
	
	public static void main(String[] args) {
		
		System.out.println("2D Array");
		int[][] stu = new int[3][];
		stu[0] = new int[2];
		stu[1] = new int[3];
		stu[2] = new int[4];
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the 9 values for the 2d array of 3X3 dimension");
		
		for(int i=0;i<stu.length;i++)
		{
			for(int j=0;j<stu[i].length;j++)
			{
				System.out.println("Enter the " + i + " row " + j + " column element");
				stu[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("2d array is: ");
		
		for(int i=0;i<stu.length;i++)
		{
			for(int j=0;j<stu[i].length;j++)
			{
				System.out.print(stu[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
