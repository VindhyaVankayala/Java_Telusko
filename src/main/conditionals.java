package main;

public class conditionals {
	
	public static void main(String[] args) {
		
		int age = 21;
		
		if(age>18 && age <=60)
		{
			if(age >25)
				System.out.println("I hope you're married");
			else
				System.out.println("Enjoy your bachelor life");
		}
		else if(age == 18)
			System.out.println("Just turned an adult but still a teen");
		else if(age > 60)
			System.out.println("Take care and Enjoy retirement");
		else
			System.out.println("Enjoy kid..");
		
		//Ternary operator
		
		int a = 10;
		int b = 4;
		int c = 27;
		int maxi1 = (a > b) ? a : b;
		System.out.println("maxi1: " + maxi1);
		
		//int max2 = (a>b)?(a>c)?a:(b>a)?(b>c)?b:(c>a)?(c>b)?c;
		int maxi2 = Math.max(a, Math.max(b, c));
		System.out.println("maxi2:" + maxi2);
		
		int maxi3 = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("maxi3:" + maxi3);
		
				
	}

}
