package jb29.unit9.classes;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) throws Exception {

		int min;
		int max;
		int countCurrent;

		min = enterIntFromConsole("min");
		max = enterIntFromConsole("max");
		countCurrent = enterIntFromConsole("current counter value");

		Counter counter = new Counter(countCurrent, min, max);

		counter.increaseCounter();
		System.out.println(counter.toString());

		counter.decreaseCounter();
		System.out.println(counter.toString());

	}

	public static int enterIntFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextInt()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextInt();

		return number;

	}

}
