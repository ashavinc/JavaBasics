import java.util.Scanner;

public class OddEven {

					public static void main(String[] args) {
				// TODO Auto-generated method stub
				int num;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter number: ");
				num=s.nextInt();
				
				if(num%2==0)
				{
					System.out.println("Number " + num + " is even");}
					else
						{System.out.println("Number "+ num + " is odd");
				}

			}

		}

