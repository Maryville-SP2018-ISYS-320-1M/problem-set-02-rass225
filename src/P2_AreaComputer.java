/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P2_AreaComputer {
	public static void main(String[] args) {
		System.out.println("The area is " +triangleArea(8, 6, 11) +".");
		}
	
	public static double triangleArea(double a,double b,double c ) {
			double s = (a+b+c) / 2;
			return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	
	}

}
