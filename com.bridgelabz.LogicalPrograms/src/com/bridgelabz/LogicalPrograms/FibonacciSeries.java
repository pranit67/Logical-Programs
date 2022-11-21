package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void checkSeries() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of fibanocci Series  :");
		int number = sc.nextInt();
		int Term1 = 0;
		int Term2 = 1;
		for (int i = 0; i < number; i++) {
			System.out.print(Term1 + " ");
			int Term3 = Term1 + Term2;
			Term1 = Term2;
			Term2 = Term3;
		}
	}

	public static void main(String[] args) {
		checkSeries();
	}
}
