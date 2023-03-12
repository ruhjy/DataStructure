package functionalinterface.sample;

import java.util.function.*;

public class PredicateSample {
	public static void main(String[] args) {
		
		Predicate<Integer> equalsCount = (count) -> (count.equals(50));
		System.out.println(equalsCount.test(30));
		System.out.println(equalsCount.test(50));
		
//		String name = "java";
		Predicate<String> str = (name) -> (name.contains("java"));
		System.out.println(str.test("java"));
		System.out.println(str.test("spring"));
		
	}
}
