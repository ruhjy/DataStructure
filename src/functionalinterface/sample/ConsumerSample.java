package functionalinterface.sample;

import java.util.function.*;
import java.util.stream.*;

public class ConsumerSample {
	public static void main(String[] args) {
		
		Consumer<String> print = (message) -> System.out.println("message = " + message);
		print.accept("hello java!!");
		
		int[] arr = {1,2,3};
		IntStream.of(arr).forEach(n -> System.out.println("arr = " + n));
		
	}
}
