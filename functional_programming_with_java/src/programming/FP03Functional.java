package programming;

import java.util.List;
import java.util.function.Consumer;

public class FP03Functional {
	private static final List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF",
			"Azure", "Docker", "Kubernetes");
	private static final List<Integer> numbersList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int oddNumbersSum = addOddNumbersSumInListFunctional(numbersList);
		System.out.println("oddNumbersSum : "+oddNumbersSum);
		System.out.println("\n\n");
		
		addNonDuplicateNumbersInListFunctional(numbersList);
		addNonDuplicateSortedNumbersInListFunctional(numbersList);
		
	}

	private static void addNonDuplicateNumbersInListFunctional(List<Integer> numberslist2) {
		// TODO Auto-generated method stub
		numberslist2.stream().distinct().forEach(System.out::println);
		
	}
	
	private static void addNonDuplicateSortedNumbersInListFunctional(List<Integer> numberslist2) {
		// TODO Auto-generated method stub
		numberslist2.stream().distinct().sorted().forEach(System.out::println);
		
	}

	private static int addOddNumbersSumInListFunctional(List<Integer> numberslist2) {
		
		return numberslist2.stream().filter(number -> number%2 != 0).reduce(0, (x, y) -> x+y);
	}


}
