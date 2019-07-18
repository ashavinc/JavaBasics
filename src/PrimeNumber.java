import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s= new Scanner(System.in);
 int num;
 System.out.println("Enter number :");
 num=s.nextInt();
  
 int temp=0;
 for(int i=2;i<=num-1;i++)
 {
	 if(num%i==0)
	 {
		 temp=temp+1;
	 }
 }
if(temp>0)
{
	System.out.println("Number is not prime");
}
else 
{
	System.out.println("Number is Prime");}
}
	}


