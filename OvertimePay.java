/* Write a program to calculate overtime pay of 10 employees.
Overtime  is paid at the rate of Rs. 12.00 per hour for every hour worked above 40 hours.
Assume that the employees do not work for the fractional part of an hour. */

package naren.sourcecodes;

import java.util.Scanner;

public class OvertimePay {
	public static void main(String[] args) {
		int overtime = 0;
		int i = 1;
		System.out.print("Enter the hours for 10 employees worked above 40 hours : ");
		Scanner scanIn = new Scanner(System.in);
		Integer time = scanIn.nextInt();
		while(i<=time)
		 {
		  overtime=i*12;
		  i++;
		 }
		System.out.println("Overtime pay of 10 employees is Rs. " + overtime);
	}
}
