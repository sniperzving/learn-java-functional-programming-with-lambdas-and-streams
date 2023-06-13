package programming;

import java.util.List;

public class FP01Structured {

	private static final List<Integer> numbersList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersInListStructured(numbersList);
		System.out.println("\n\n");
		printAllEvenNumbersInListStructured(numbersList);
		System.out.println("\n\n");
		printAllOddNumbersInListStructured(numbersList);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for(int number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for(int number : numbers) {
			if(number%2 == 0)
			System.out.println(number);
		}
	}
	
	private static void printAllOddNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for(int number : numbers) {
			if(number%2 != 0)
			System.out.println(number);
		}
	}

}
