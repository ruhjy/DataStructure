package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class CreateStreamSorted {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("java", "css", "jsp", "spring", "javascript", "html", "php");
		Stream<String> stream2 = Stream.of("java", "css", "jsp", "spring", "javascript", "html", "php");
		Stream<String> stream3 = Stream.of("java", "css", "jsp", "spring", "javascript", "html", "php");
		Stream<String> stream4 = Stream.of("java", "css", "jsp", "spring", "javascript", "html", "php");
		Stream<String> stream5 = Stream.of("java", "css", "jsp", "spring", "javascript", "html", "php");

		stream1.sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();

		stream2.sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
		System.out.println();

		stream5.map(s -> s.length()).sorted().forEach(n -> System.out.print(n + "    "));
		System.out.println();

		stream3.sorted(Comparator.comparing(String::length)).forEach(n -> System.out.print(n + " "));
		System.out.println();

		stream4.sorted(Comparator.comparing(String::length).reversed()).forEach(n -> System.out.print(n + " "));

	}
}
