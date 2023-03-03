package lt.lhu.unit09.main;

import java.util.Scanner;

public class Task01Lesson09 {

	public static void main(String[] args) {
		double x = inputDoubleFromConsole("Введите значение x: ");
		double result = calculateFunction(x);

		simplePrint(x, result);
		richPrint(x, result);
	}

	public static double inputDoubleFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}

		return sc.nextDouble();
	}

	public static double calculateFunction(double a) {
		return Math.sqrt(Math.pow(Math.E, 2.2 * a)) - Math.abs(Math.sin(Math.PI * a / (a + 2.0 / 3.0))) + 1.7;
	}

	public static void simplePrint(double x, double result) {
		System.out.println("x = " + x + ", result = " + result);
	}

	public static void richPrint(double x, double result) {
		System.out.printf("x = [%4.2f], result = [%6.11f]", x, result);
	}
}
