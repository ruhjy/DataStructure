package lambda;

import java.util.*;
import java.util.function.*;

public class PredicateAndConsumer {

	public static void main(String[] args) {

		List<Grape> inventory = Arrays.asList(
				new Grape(70, "green"),
				new Grape(90, "purple"),
				new Grape(120, "red"));

		// Predicate 사용
		filter(inventory, (grape -> grape.getWeight() >= 100))
				.forEach(System.out::println);
		System.out.println();

		// Consumer 사용

		printGrapeInfo(inventory, grape -> System.out.println(grape));

	}

	public static void printGrapeInfo(List<Grape> inventory, Consumer<Grape> consumer) {
		for (Grape grape : inventory) {
			consumer.accept(grape);
		}
	}

	public static List<Grape> filter(List<Grape> inventory, Predicate<Grape> p) {
		List<Grape> result = new ArrayList<>();
		for (Grape grape : inventory) {
			if (p.test(grape)) {
				result.add(grape);
			}
		}
		return result;
	}
}
