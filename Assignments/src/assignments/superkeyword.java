package assignments;



class D1{
	
	int age  = 23;
}

class D2 extends D1{
	
	int age = 25;
	
	public void display() {
		
		System.out.println(age);
		System.out.println(super.age);
	}
}

public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D2 obj = new D2();
		
		obj.display();
	}

}
