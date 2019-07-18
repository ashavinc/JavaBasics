import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] numerals = {
				"I","II","III","IV","V","VI","VII","VIII","IX","X"
		};
Scanner s = new Scanner(System.in);

System.out.print("Enter a number from 1 to 10 :\t");
int num = s.nextInt();

String numeral;
numeral = numerals[num-1];
System.out.println("The roman numeral is " + numeral);

	}

}
