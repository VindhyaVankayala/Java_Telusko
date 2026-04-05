package main;

interface ICourse
{
	String course(String name);
}

public class FunctionalInterface4 {

	public static void main(String[] args) {
		
		ICourse course1 = (String a) -> { return ("course is ") + a;};
		System.out.println(course1.course("Java"));
		
		courseInfo((name) -> {return name;});
		
	}
	
	public static void courseInfo(ICourse course1)
	{
		System.out.println("Course name is " + course1.course("Java Spring"));
	}
}
