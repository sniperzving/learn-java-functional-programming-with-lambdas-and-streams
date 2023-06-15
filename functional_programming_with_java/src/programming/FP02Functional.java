package programming;

import java.util.List;
import java.util.function.Consumer;

public class FP02Functional {
	private static final List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
	private static final List<Integer> numbersList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAllCoursesInListFunctional(courses);
		System.out.println("\n\n");
		printAllCoursesContainingSpringInListFunctional(courses);
		System.out.println("\n\n");
		printAllCoursesWithFourLettersInListFunctional(courses);
		System.out.println("\n\n");
		printCaractersNumbersOfEachCourseInListFunctional(courses);
		System.out.println("\n\n");
		int sum = addListFunctional(numbersList);
		System.out.println(sum);
		System.out.println("\n\n");
	}

	private static int sum(int a, int b) {
		System.out.println(a+"  "+b);
		return a+b;
	}
	
	private static int addListFunctional(List<Integer> numberslist2) {

		
//		return numberslist2.stream().reduce(0, FP02Functional::sum);
//		return numberslist2.stream().reduce(0, Integer::sum);
		return numberslist2.stream().reduce(0, (a, b) -> a+b);
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
