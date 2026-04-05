package main;

public class Strings1 {
	
	public static void main(String[] args) {
		String str1 = "Vindhya";
		String str2 = "Vindhya";
		System.out.println(str1==str2);
		str1 = new String("Vindhya");
		str2 = new String("Vindhya");
		System.out.println(str1 == str2);
	}

}
