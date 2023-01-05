package assignments;

//CONSTRUCTOR EXECUTION FLOW

class Demo{
	
	int a,b;
	
	Demo(){
		this(100,200);
		a=20;
		b=30;
		System.out.println("default constructor");
	}
	
	Demo(int a, int b){
		
		this.a = a;
		this.b = b;
		System.out.println("paramaterized constructor");
	}
}


class Demo1 extends Demo{
	
	int x,y;
	
	Demo1(){
		this(100,233);
		x = 89;
		y = 22;
		System.out.println("Derived default constructor");
	}
	
	Demo1(int x, int y){
		
		this.x = x;
		this.y = y;
		System.out.println("Derived class paramaterized constructor");
	}
	
	void disp() {
		
		System.out.println("heyy hello");
	}
}


public class inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d = new Demo1();
		d.disp();
		
	}

}
