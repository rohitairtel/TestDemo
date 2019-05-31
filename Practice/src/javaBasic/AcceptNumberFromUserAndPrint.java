package javaBasic;

import java.util.Scanner;

public class AcceptNumberFromUserAndPrint {

	public static void main(String[] args) {

		/*
		 * Scanner num = new Scanner(System.in);
		 * System.out.println("Please enter first number"); int a = num.nextInt();
		 * System.out.println("Please enter second number"); int b = num.nextInt(); int
		 * c = a+b; System.out.println("The Sum to Two Number"+ c);
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println(c);

	}

}
