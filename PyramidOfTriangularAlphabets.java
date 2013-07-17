/*

Sample Output:

    n=2    n=5
    a      a
    bc     bc
           def
           ghij
           klmno

*/




package naren.sourcecodes;

import java.util.Scanner;

public class PyramidOfTriangularAlphabets {
	
	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int val = 97;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) val);
				val = val + 1;
			}
			System.out.println();
		}
	}

}
