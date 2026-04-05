package main;

interface course
{
	void disp();
}

class eLearn implements course {
	
	public void disp()
	{
		System.out.println("Welcom to Java Springboot course");
	}
}

//class academy implements course {
//	
//	
//	
//}

public class FunctionalInterface {
	
	public static void main(String[] args) {
		
		//Implementing interface using a class
		
		course c1 = new eLearn();
		c1.disp();
		
		//anonymous inner class
		
		course c2 = new course() {
			
			public void disp() {
				System.out.println("Welcom to course from anonymous inner class");
			}
		};
		c2.disp();
		
		// Using lambda expressions
		
		course c3 = () -> {System.out.println("Welcome from lambda expression");};
		c3.disp();
		
	}

	

}
