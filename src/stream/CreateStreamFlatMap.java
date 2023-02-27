package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamFlatMap {
	public static void main(String[] args) {

		Stream<String[]> stream = Stream.of(
				new String[] { "Python", "java", "Spring" },
				new String[] { "html", "css", "javascript" }
				);
		
		stream.flatMap(Arrays::stream).sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
	}
}
