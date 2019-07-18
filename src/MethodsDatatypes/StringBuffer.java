package MethodsDatatypes;

public class StringBuffer {

	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1, str2;
str1="Good";
str2="Good";

StringBuffer s1= new StringBuffer("Hello");
StringBuffer s2= new StringBuffer("Hello");
s2= new StringBuffer("Riley");


if (str1==str2)
{
	System.out.println("Pass");
	}
else 
{System.out.println("Fail");
	}



if (s1.toString()==s2.toString())
{
	System.out.println("Pass");
}
else
{
	System.out.println("Fail");
}

}
}
