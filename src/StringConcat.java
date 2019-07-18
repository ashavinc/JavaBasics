
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2,fstr;
		str1= "Iam in Class    ";
		str2= "We are learning Java";
		int a=10;
		int b=20;
		fstr=str1+str2;
		
		str1=str1.toLowerCase();
		str2=str2.toUpperCase();
		
		
		System.out.println("Length before trim " + str1.length());

		str1=str1.trim();
		System.out.println("Length after trim " +str1.length());

		//String date=String.join("/","27","5","1980");
		
		
		
		String[] s = str1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		
		}
		
		
		System.out.println(fstr);
		System.out.println(a+b);
		System.out.println(a+b+fstr);
		System.out.println(fstr+a+b);
		System.out.println(fstr+(a+b));
		
		//System.out.println(date);

		System.out.println(str1.charAt(0));
		System.out.println(str1.length());
		System.out.println(str2.substring(7,16));
		System.out.println(str1.isEmpty());



		}
		

	}


