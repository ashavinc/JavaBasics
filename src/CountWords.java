
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =" My name is Asha Vincent and I am learning Java Strings";
		System.out.println(Count(str));

	}
	
 private static int Count(String str)
	{
		int wordCount=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ' && 
				i<str.length()-1 && str.charAt(i+1)!=' ')
			{
				wordCount++;
			}
		}
		return wordCount;
	}

}
