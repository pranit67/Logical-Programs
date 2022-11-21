package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class SimulateStopwatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start the stop watch");
		double startTime = sc.nextDouble();
		startTime = System.currentTimeMillis();

		System.out.println("Press 0 to stop the stop watch");
		double endTime = sc.nextDouble();
		endTime = System.currentTimeMillis();

		System.out.println("The Elapsed time is  " + ((endTime - startTime) / 1000) + " seconds ");

	}
}
