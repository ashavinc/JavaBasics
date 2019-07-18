import java.util.Scanner;

public class SwapWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		a=s.nextInt();
		System.out.println("Enter value of b: ");
		b=s.nextInt();
		
		System.out.println("a =" +a+" b = "+b);
		 
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("a =" +a+" b = "+b);
		
		

	}

}
