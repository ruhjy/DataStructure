package stream;

import java.util.Comparator;
import java.util.stream.Stream;


public class CreateStreamMap {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("java", "spring", "javascript", "css", "php");
		Stream<String> stream2 = Stream.of("java", "spring", "javascript", "css", "php");
//		stream.map(s -> s.length()).forEach(n -> System.out.print(n + " "));

//		stream.map(s -> s.length()).sorted().filter(l -> l > 3).forEach(s -> System.out.print(s + " "));
		
		stream1.sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
		

	}
}
