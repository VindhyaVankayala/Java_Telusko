package main;

class Student {
	
	int id;
	String name;
	
	void greeting(String name) {
		System.out.println("Welcome to the class " + name);
	}
}

public class Array3 {
	
	public static void main(String[] args) {
		
		Student[] st = new Student[3];
		
		st[0] = new Student();
		st[1] = new Student();
		st[2] = new Student();
		
		st[0].id = 1;
		st[0].name = "Vindhya";
		st[1].id = 2;
		st[1].name = "Keerthi";
		st[2].id = 3;
		st[2].name = "Krishna";
		
		for(Student s : st)
		{
			s.greeting(s.name);
		}
	}

}
