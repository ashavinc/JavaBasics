import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int rem,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to reverse ");
		num=s.nextInt();
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of number is "+ rev);
		

	}

}
