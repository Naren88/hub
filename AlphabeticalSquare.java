/*
    Sample Output:
    Enter the number of lines for the characters to be printed: 6
    abcdef
    a    f
    a    f
    a    f
    a    f
    abcdef
*/
package naren.sourcecodes;

import java.util.Scanner;

public class AlphabeticalSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of lines for the characters to be printed: ");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++)
				if (i == 1 || i == num || j == 1 || j == num)
					System.out.print((char)(j + 96));
				else
					System.out.print(" ");
			System.out.println();
		}
	}

}
