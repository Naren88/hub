/*
    For any given value of r, the equation x^2 + y^2 = r^2 represents a circle. A point (a,b) lies inside the circle if a^2 + b^2 < r^2.
    Find for any given value of r, list all the points with integer coordinates (a,b) which lies inside the circle.
*/

package naren.sourcecodes;

import java.util.Scanner;

public class CircleCoordinates {

	public static void main(String[] args) {
		System.out.print("Enter the 'r' value: ");
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		System.out.println("Points with coordinates (a,b) for the given value " + r +" which lies inside circle : ");
		for (int a = 0; a < r; a++) {
			for (int b = 0; b < r; b++) {
				if ((a * a) + (b * b) < (r * r)) {
					System.out.print("(" + a + "," + b +")\t");
				}
			}
		}

	}

}

/*

The output will be as:

Enter the 'r' value: 2
Points with integer coordinates (a,b) for the given value 2 which lies inside circle : 
(0,0)	(0,1)	(1,0)	(1,1)	

*/