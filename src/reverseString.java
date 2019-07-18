
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="aabaa";
String strRev="";
int strLen=str.length();

for(int i= strLen-1; i>=0; i--)
{
	strRev= strRev+ str.charAt(i);
}
System.out.println(strRev);
if (str.equals(strRev))
 	{
	System.out.print(strRev  + " is a palindrome");
	}

}
}

