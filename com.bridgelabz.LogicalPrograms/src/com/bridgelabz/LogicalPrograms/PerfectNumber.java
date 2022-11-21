package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void checkPerfect() {
		int a, value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter The Number: ");
		int num = sc.nextInt();
		for (a = 1; a < num; a++) {
			if (num % a == 0) {
				value = value + a;
			}
		}
		if (value == num) {
			System.out.println(+num + " is a Perfect Number");
		} else {
			System.out.println(+num + " is not a Perfect Number");
		}
	}

	public static void main(String[] args) {
		checkPerfect();
	}
}