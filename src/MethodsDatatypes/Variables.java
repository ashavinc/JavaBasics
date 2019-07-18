package MethodsDatatypes;


public class Variables {
	int x=10;
	
	static int y=70;
	
	public void test()
	{
		int a=20;
		System.out.println(a);
		System.out.println(x+y);
	}
	
	public static void main(String[] args)
	{
		Variables var = new Variables();
		System.out.println(var.x);
		System.out.println(y);
		var.test();
	}
}