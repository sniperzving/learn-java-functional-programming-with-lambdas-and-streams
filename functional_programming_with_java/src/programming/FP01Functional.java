package programming;

import java.util.List;
import java.util.function.Consumer;

public class FP01Functional {
	private static final List<Integer> numbersList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAllNumbersInListFunctional(numbersList);
	}

	private static void print(int number) {
		System.out.println(number);
	}
	private static void printAllNumbersInListFunctional(List<Integer> numbersList) {
		// What to do?
		numbersList.stream().forEach(FP01Functional::print); // Method reference
	}

}
