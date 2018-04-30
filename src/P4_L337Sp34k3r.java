/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.util.Scanner;

public class P4_L337Sp34k3r {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Please enter your three words to make L334: ");
		String firstWord = scan.nextLine();
		String secondWord = scan.nextLine();
		String thirdWord = scan.nextLine();
		
		System.out.print(firstWord + " -> ");
		System.out.println(toL337( firstWord ));
		
		System.out.print(secondWord + " -> " );
		System.out.println(toL337( secondWord ));
		
		System.out.print(thirdWord + " -> ");
		System.out.println(toL337( thirdWord ));
		
	}
	public static Object toL337(String word) {
		word = word.toUpperCase();
		word = word.replace( "A", "4");
		word = word.replace( "B", "8");
		word = word.replace( "E", "3");
		word = word.replace( "T", "7");
		word = word.replace( "S", "5");
		word = word.replace( "O", "()");
		return word;
	}
}
