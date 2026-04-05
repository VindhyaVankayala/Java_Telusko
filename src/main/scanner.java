package main;
import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a=0;
		float b=0;
		String str="";
		char ch=' ';
		System.out.println("Enter the values to read");
		if(scan.hasNextInt())
		{
			a = scan.nextInt();
		}
		if(scan.hasNextFloat())
		{
			b = scan.nextFloat();
		}
		if(scan.hasNext())
		{
			str = scan.next();
		}
		if(scan.hasNext())
		{
			ch = scan.next().charAt(0);
		}
		
		System.out.println("a: " + a + " b:" + b + " c: " + str);
		System.out.println(ch);
	}

}
