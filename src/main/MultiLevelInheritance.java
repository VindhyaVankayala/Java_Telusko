package main;

class alpha {
	
	void display() {
		System.out.println("From class alpha");
	}
}

class beta extends alpha {
	
	int id;
	String name;
	
	void showMsg() {
		System.out.println("Hello from class beta");
	}
}

class gaama extends beta {
	
	void printMsg() {
		
		id=1;
		super.display();
		super.showMsg();
		System.out.println("Hey from class gaama");
		System.out.println("id is " + id);
	}
	
}


public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		
		gaama g1 = new gaama();
		beta b1= new beta();
		//g1.display();
		//g1.showMsg();
		g1.printMsg();
		System.out.println(b1.toString());
	}

}
