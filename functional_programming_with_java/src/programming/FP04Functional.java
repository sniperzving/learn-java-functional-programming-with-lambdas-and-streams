package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP04Functional {
	private static final List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF",
			"Azure", "Docker", "Kubernetes");
	private static final List<Integer> numbersList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> doubledNumbers = doubleList(numbersList);
		System.out.println(doubledNumbers);
		System.out.println("\n\n\n");
		System.out.println("Even numbers list : "+getEvenNumbersList(doubledNumbers));
		System.out.println("\n\n\n");
		System.err.println(getLengthsOfAllCoursesList(courses));
		System.out.println("\n\n\n");
	}

	private static List<Integer> doubleList(List<Integer> numberslist2) {
		return numbersList.stream().map(nb -> nb * nb).collect(Collectors.toList());
	}
	
	private static List<Integer> getEvenNumbersList(List<Integer> numberslist2) {
		return numbersList.stream().filter(nb -> nb%2 == 0).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	}
	
	private static List<Integer> getLengthsOfAllCoursesList(List<String> courses) {
		return courses.stream().map(course -> course.length()).collect(Collectors.toList());
	}

}
