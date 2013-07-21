/*
    Sample Output: 
    
    Enter the number of lines: 5
        5
       505
      50005
     5000005
    555555555
*/
package naren.sourcecodes;

import java.util.Scanner;

public class PyramidTriangle {

	public static void main(String[] args) {

		System.out.print("Enter the number of lines: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int noOfGap = num - 1;
		int index = 1;
		for (int hrLine = 1; hrLine <= num - 1; hrLine++) {
			for (int gap = 0; gap < noOfGap; gap++) {
				System.out.print(" ");
			}
			noOfGap--;
			for (int vrLine = 0; vrLine < index; vrLine++) {
				if (vrLine == 0 || vrLine == index - 1) {
					System.out.print(num);
				} else {
					System.out.print(0);
				}

			}
			index = index + 2;
			System.out.println();
		}
		for (int lastRow = 0; lastRow < index; lastRow++) {
			System.out.print(num);
		}
	}

}
