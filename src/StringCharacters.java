/*WJP to display total number of integer, character, word, special character, upper case
and lower case in the given string*/

public class StringCharacters {

	public static void main(String[] args) {
		String str = " 1. I am Deena Vincent";
		
		int intcount=0, charactercount=0, wordcount=0, spcharcount=0, uppercase=0,lowercount=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if (ch>='a'&& ch<='z')
			{
				lowercount++;
			}
			else if (ch>='A'&& ch<='Z') {
				uppercase++;}
			else if (ch>='0'&& ch<='9') {
				intcount++;}
			else 
				spcharcount++;
		}
		System.out.println("Uppercase "+ uppercase);
		System.out.println("Lowercase "+ lowercount);
		System.out.println("Integers "+ intcount++);
		System.out.println("Special characters "+ spcharcount);
		System.out.println("Number of words: "+ str.split("\\s").length);
	}
	
}
