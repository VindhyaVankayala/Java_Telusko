package main;

public class Child extends Parent1 {
	
	int level;
	String name;
	
	void setName(String name)
	{
		this.name = name;
		System.out.println("Parent's name: " + super.name);
	}
	
	void dressingStyle() {
		System.out.println("Child is simple and doesn't dress fancy and prefers simple looks");
	}
	
	void habit() {
		System.out.println("Child is devotional and spiritual");
	}
	
	public static void main(String[] args)
	{
		Child c1 = new Child();
		Parent1 p1 = new Child();
		
		c1.setName("Vindhya");
		System.out.println("Child's name is: " + c1.name);
		c1.sleep();
		c1.dressingStyle();
		c1.habit();
		System.out.println("Checking by calling using parent's ref p1");
		p1.sleep();
		p1.dressingStyle();
		((Child)p1).habit();
		
		
		
		
	}

}
