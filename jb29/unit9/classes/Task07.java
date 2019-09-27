package jb29.unit9.classes;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Point a = new Point(enterDoubleFromConsole("X coordinate for A"), enterDoubleFromConsole("Y coordinate for A"));
		Point b = new Point(enterDoubleFromConsole("X coordinate for B"), enterDoubleFromConsole("Y coordinate for B"));
		Point c = new Point(enterDoubleFromConsole("X coordinate for C"), enterDoubleFromConsole("Y coordinate for C"));

		Triangle triangle = new Triangle(a, b, c);

		System.out.println(triangle.toString());

		System.out.println(triangle.perimiter());

		System.out.println(triangle.square());

		System.out.println(triangle.getIntersectionMedianPoint());
	}

	public static double enterDoubleFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextDouble()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextDouble();

		return number;

	}
}
