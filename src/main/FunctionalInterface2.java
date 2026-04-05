package main;

interface FI2 {
	
	int totalCourses(String name);
}

class school implements FI2 {
	
	public int totalCourses(String name) {
		return 4;
	}
}

public class FunctionalInterface2 {
	
	public static void main(String[] args) {
		
		FI2 fi = new school();
		System.out.println("Total available courses are " + fi.totalCourses("abc"));
		
		FI2 fi2 = new FI2()
				{
					public int totalCourses(String name)
					{
						System.out.println("Anonymous inner class type impl");
						return 5;
					}
				};
				System.out.println("Total available courses are " + fi2.totalCourses("java"));
		
		//String cName = "Spring";
		FI2 fi3 = (String cName) -> {
			System.out.println("Lambda expression");
			return 6;
		};
		System.out.println("Total available courses are " + fi3.totalCourses("Spring"));
		
		// Another implemenation of lambda
		
		FI2 fi4 = name -> name.length();
		System.out.println("2nd implementation of lambda " + fi4.totalCourses("Spring"));
	}
	
	

}
