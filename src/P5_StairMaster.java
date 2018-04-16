/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;
public class P5_StairMaster {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("How many stairs are in your staircase? ");
		int stairCount = scan.nextInt();
		System.out.print("How wide should each stair be? ");
		int width = scan.nextInt();
			drawStairs(width, stairCount);
	}
	public static void drawStairs(int width, int amount) {
		for (int steps = 0; steps < amount; steps++) { 
		
		for(int lines = 2; lines >= 1; lines--) { 
			System.out.print("**");
			
		for(int spaces = width * steps; spaces >= 1; spaces--) { 
			System.out.print(" ");
		}
		for(int stars = width; stars >= 1; stars--) {
			System.out.print("*");
		}
		System.out.println();
		}
		}
	}
}
