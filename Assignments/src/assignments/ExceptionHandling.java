package assignments;

import java.util.Scanner;

//Checked exception(which compiler knows) are generally ducked by simply writing throws and then exception name
//Unchecked exception(which compiler don't know) are handled by try and catch



public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int div;
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		div = a/b;
		}
		catch(ArithmeticException e) {
			
			System.out.println("exception raised, by default division will show 0 now");
			div = 0;
			System.out.println(div);
			sc.close();
			throw e;
			//statement below throw will never get executed except you have used finally block
		
			
		}
		
		sc.close();
	}

}
