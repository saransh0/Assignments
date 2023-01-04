package assignments;


class Objects{
	
	int x;
	int y;
	
	static int count=0;
	
	{
		
		count++;
	}
	
	Objects(int x, int y){
		
		this.x = x;
		this.y = y;
	}
	
}
public class CountObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Objects ob1 = new Objects(10,12);
		Objects ob2 = new Objects(10,12);
		Objects ob3 = new Objects(10,12);
		Objects ob4 = new Objects(10,12);
		
		System.out.println(Objects.count);
	}

}
