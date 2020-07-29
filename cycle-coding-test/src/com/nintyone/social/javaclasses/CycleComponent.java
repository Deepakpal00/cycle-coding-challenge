package com.nintyone.social.javaclasses;

import java.util.Scanner;

import com.nintyone.social.configurations.CycleConfigurations;

public class CycleComponent {

	private Scanner scanner = new Scanner(System.in);
	CycleConfigurations cycleConfigurations = new CycleConfigurations();

	public CycleConfigurations returnComponentMessage() {
		System.out.println("Enter Frame Type");
		System.out.println("\t 1) For Steel Type ");
		System.out.println("\t 2) For Other Type ");

		cycleConfigurations.frameType = scanner.nextInt();

		System.out.println("Enter Tyre Type");
		System.out.println("\t 1) For TubeLess ");
		System.out.println("\t 2) For WithTube ");

		cycleConfigurations.tubetype = scanner.nextInt();

		System.out.println("Enter Number of Gear");
		System.out.println("\t 1) For 1 Gear ");
		System.out.println("\t 2) For 2 Gear ");
		System.out.println("\t 3) For 3 Gear ");
		System.out.println("\t 4) For 4 Gear ");

		cycleConfigurations.noOfGears = scanner.nextInt();

		return cycleConfigurations;
	}
}
