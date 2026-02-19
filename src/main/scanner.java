package main;
import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values to read");
		int a = scan.nextInt();
		float b = scan.nextFloat();
		String str = scan.next();
		System.out.println("a: " + a + " b:" + b + " c: " + str);
	}

}
