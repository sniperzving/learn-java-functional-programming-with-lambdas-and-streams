package programming;

import java.util.Comparator;
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
		System.out.println("\n\n");
		addNonDuplicateSortedNumbersInListFunctional(numbersList);
		System.out.println("\n\n");
		addNonDuplicateSortedCoursesInListFunctional(courses);
		System.out.println("\n\n");
		addNonDuplicateSortedRevrseOrderCoursesInListFunctional(courses);
		System.out.println("\n\n");
		addNonDuplicateSortedCoursesInListByLengthFunctional(courses);
		System.out.println("\n\n");
		addNonDuplicateSortedCoursesInListByLengthReversedFunctional(courses);
	}

	private static void addNonDuplicateSortedCoursesInListFunctional(List<String> numberslist2) {
		courses.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
	}
	
	private static void addNonDuplicateSortedRevrseOrderCoursesInListFunctional(List<String> numberslist2) {
		courses.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
	
	private static void addNonDuplicateSortedCoursesInListByLengthFunctional(List<String> coursesList) {
		coursesList.stream().distinct().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
		
	}
	
	private static void addNonDuplicateSortedCoursesInListByLengthReversedFunctional(List<String> coursesList) {
		coursesList.stream().distinct().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
		
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
