package assignments;



class Student{
	
	static int age;
	static int id;
	
	static{
		
		age = 20;
		id = 40;
		System.out.println("static block");
	}
	
	static void disp() {
		
		System.out.println("static method");
		System.out.println("a: "+ age + " "+ "b: " +id);
	}
	
	int x;
	int y;
	
	{	
		x=20;
		y=30;
		
		System.out.println("non static java block");
	}
	
	Student(){
		
		System.out.println("constructor");
	}
	
	void disp1() {
		
		System.out.println("non static block");
		System.out.println("x: "+x+" y: "+y);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Student.disp();
		
		Student st = new Student();
		st.disp1();
		
	}

}
