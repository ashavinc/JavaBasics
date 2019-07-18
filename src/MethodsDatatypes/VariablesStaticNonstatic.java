package MethodsDatatypes;

public class VariablesStaticNonstatic {

	static int a;  //static variable
	int b;    //non-static variable
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesStaticNonstatic v= new VariablesStaticNonstatic();
		v.stopMe();
		a=10;
		v.b=3;
		
		

	}

	public static void RunMe(){  //static method
		
		int a;
		a=70;
		Sample();
		stopMe();

	}
	
	public void stopMe() {   // non-static method
		int a;
		int b;
		restart();
	}
	
	public void restart() {
		
	}
	
	public static void Sample() {
		
	}
}
