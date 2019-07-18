import java.util.Scanner;

public class SwapWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, temp;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		a=s.nextInt();
		System.out.println("Enter value of b: ");
		b=s.nextInt();
		
		System.out.println("a =" +a+" b = "+b);
		 
		temp=a;
		a=b;
		temp=b;
		
		System.out.println("a =" +a+" b = "+b);
		
		

	}

}
