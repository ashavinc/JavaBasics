import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "career";
String str2 = "arecer";
char[] chArr1 = str1.toCharArray();
char[] chArr2 = str2.toCharArray();

Arrays.sort(chArr1);
Arrays.sort(chArr2);
System.out.println("Both strings are anagrams " + Arrays.equals(chArr1,chArr2));
	}

}
