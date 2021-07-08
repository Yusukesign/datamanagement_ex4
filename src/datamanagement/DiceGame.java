package datamanagement;

import java.util.Random;

public class DiceGame {
	public static void main(String[] args) {
		final Random r = new Random();
		final int dice1 = r.nextInt(6);
		final int dice2 = r.nextInt(6);

		System.out.println("Rolling the dice...");
		System.out.println("Die 1: " + dice1);
		System.out.println("Die 2: " + dice2);
		System.out.println("Total value:" + (dice1 + dice2));
	}
}
