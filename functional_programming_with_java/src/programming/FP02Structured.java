package programming;

import java.util.List;

public class FP02Structured {

	private static final List<Integer> numbersList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = addListStructured(numbersList);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numberslist2) {
		// How to loop?
		// How to store the sum?
		int sum = 0;
		try {
			for (int number : numberslist2) {
				sum += number;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sum;
	}

}
