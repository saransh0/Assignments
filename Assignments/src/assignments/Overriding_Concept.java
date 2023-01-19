package assignments;


class Parent{
	
	void display() {
		
		System.out.println("Parent display");	
	}
}

class Child1 extends Parent{
	
	void display() {
		
		System.out.println("child1 display");
	}
}

class Child2 extends Parent{
	
	void display() {
		
		System.out.println("child2 display");
	}
}


public class Overriding_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		Parent p1 = c1;
		
		p1.display();
		
		p1 = c2;
		 p1.display();
	}

}
