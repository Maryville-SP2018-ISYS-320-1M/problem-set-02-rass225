/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;
public class P3_YouAndYourAge {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);		
		System.out.println("What is your name?");
		String name = scan.nextLine();		
		System.out.println("And how old are you?");
		int age = scan.nextInt();		
		System.out.println("Wow "+ name +", you've been alive " + age + " years? Amazing.");				
	}
}
