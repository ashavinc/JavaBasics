import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n,fact=1;
System.out.println("Enter number to find factorial: ");
	n=s.nextInt();
for(int i=1;i<=n;i++)
{  
	fact=fact*i;
}
	System.out.println("Factorial of "+n+" is "+fact);
	}

}
