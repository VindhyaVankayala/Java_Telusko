package main;

interface FI3 
{
	float add(int a, float b);
	
	default void show() {
		System.out.println("default method from FI2");
	}
}

public class FunctionalInterface3 {
	
	public static void main(String[] args) {
		
		FI3 fiImpl = (a,b) -> a+b;
		show(fiImpl);
		fiImpl.show();
		show((a,b) -> a+b); //Implementing lambda expression while calling
		
	}
	
	public static void show(FI3 fi) {
		
		System.out.println("Static method show");
		System.out.println(fi.add(3,4.5f));
	}

}
