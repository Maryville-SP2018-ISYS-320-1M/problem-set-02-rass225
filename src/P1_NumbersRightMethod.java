/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P1_NumbersRightMethod {

	public static void main(String[] args) {
		drawNumbersRight(7);
	}
	public static void drawNumbersRight(int height) {
		for (int row = 1; row <= height; row++) {
			for (int spaces = 1; spaces <= row * - 1 + height; spaces ++) {
				System.out.print(" ");
			}	
			
			for (int number = 1; number <= row; number++) {
				System.out.print(row);
			}
			System.out.println();
		}		
	}
}
