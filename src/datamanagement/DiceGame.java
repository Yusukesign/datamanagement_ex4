package datamanagement;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("What is your name?");
	    final String name = scanner.nextLine();
	    System.out.println("Hello," + name + "!");

		final Random r = new Random();
		final int dice1 = r.nextInt(5) + 1;
		final int dice2 = r.nextInt(5) + 1;

		System.out.println("Rolling the dice...");
		System.out.println("Die 1: " + dice1);
		System.out.println("Die 2: " + dice2);
		final int total = dice1 + dice2;
		System.out.println("Total value:" + total);

		final String result = total > 7 ? name + " won" : name + " lost";

		System.out.println(result);
	}
}
