import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);

		System.out.println("Enter string: ");
		String str=s.next();
		str=str.toLowerCase();
		
		String strRev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{ 
			strRev=strRev+str.charAt(i);
			}
		System.out.println(strRev);
		
		if(str.equals(strRev))
		{
			System.out.println("String is a palindrome ");
		}
	}

}
