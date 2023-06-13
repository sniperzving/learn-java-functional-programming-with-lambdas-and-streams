package programming;

import java.util.List;
import java.util.function.Consumer;

public class FP01Functional {
	private static final List<Integer> numbersList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAllNumbersInListFunctional(numbersList);
		System.out.println("\n\n");
		printAllEvenNumbersInListFunctional(numbersList);
		System.out.println("\n\n");
		printAllOddNumbersInListFunctional(numbersList);
	}

//private static void print(int number) {
//		System.out.println(number);
//	}
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbersList) {
		// What to do?
		numbersList.stream().forEach(System.out::println); // Method reference
	}

	private static void printAllEvenNumbersInListFunctional(List<Integer> numbersList) {
		// What to do? method reference & lambda expression
		numbersList.stream().filter(FP01Functional::isEven).forEach(number -> System.out.println(number));
	}

	private static void printAllOddNumbersInListFunctional(List<Integer> numbersList) {
		// What to do?
		numbersList.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}
}
