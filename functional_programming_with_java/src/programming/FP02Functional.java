package programming;

import java.util.List;
import java.util.function.Consumer;

public class FP02Functional {
	private static final List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAllCoursesInListFunctional(courses);
		System.out.println("\n\n");
		printAllCoursesContainingSpringInListFunctional(courses);
		System.out.println("\n\n");
		printAllCoursesWithFourLettersInListFunctional(courses);
		System.out.println("\n\n");
		printCaractersNumbersOfEachCourseInListFunctional(courses);
	}

	private static void printAllCoursesInListFunctional(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream().forEach(course -> System.out.println(course));
		
	}
	
	private static void printAllCoursesContainingSpringInListFunctional(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		
	}
	
	private static void printAllCoursesWithFourLettersInListFunctional(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);
		
	}
	
	private static void printCaractersNumbersOfEachCourseInListFunctional(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream().map(course -> course + " ---> "+course.length()).forEach(System.out::println);
		
	}

}
