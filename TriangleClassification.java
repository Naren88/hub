package naren.sourcecodes;

import java.util.Scanner;

public class TriangleClassification {
	
	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		System.out.print("Enter a value: ");
		Integer a = scanIn.nextInt();
		System.out.print("Enter b value: ");
		Integer b = scanIn.nextInt();
		System.out.print("Enter c value: ");
		Integer c = scanIn.nextInt();
		
		System.out.println((c^2)==(a^2+b^2)?"Right angled triangle":((c^2)<(a^2+b^2)?"Acute triangle":((c^2)>(a^2+b^2)?"Obtuse triangle":"")));
		System.out.println(a==b&&a==c?"Equilateral Triangle":(a==b||a==c||b==c?"Isosceles triangle":""));
		
		}

}
