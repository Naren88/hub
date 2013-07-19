/*
    Write a program that reads in data, then prints two counts at the end:
    how many positive integers appear before the negative number and how many appear?
    You can use either while or do-while loops (or one of each)
*/
package naren.sourcecodes;

import java.util.Scanner;

public class PositiveIntergersCount {
		public static void main(String ar[]) {
			int num;
			int totalCount = 0;
			int beforeCount = 0;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the numbers: ");
			do {
				num = scan.nextInt();
				if (num > 0) {
					totalCount++;

				} else if (num < 0) {
					beforeCount = totalCount;
				}
			} while (num != 0);
			if (beforeCount != 0) {
				System.out.println(beforeCount + " positive integer(s) appeared before the negative number");
				System.out.print((totalCount - beforeCount) + " positive integer(s) appeared after the negative number");
			} else {
				System.out.println(totalCount + " positive integer(s) appeared before the negative number");
				System.out.print(beforeCount + " positive integer(s) appeared after the negative number");
			}
		}
}
/*
    Sample Output:
    
    Enter the numbers: 10 2 4 6 -4 8 9 2 0
    4 positive integer(s) appeared before the negative number
    3 positive integer(s) appeared after the negative number
*/