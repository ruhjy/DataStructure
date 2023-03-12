package aroundhubstudio.sample;

import java.util.function.*;

public class FunctionSample {
	public static void main(String[] args) {
		
		Function<String, String> function = (message) -> "Message = " + message;
		System.out.println(function.apply("java"));
		
		BiFunction<String, Integer, String> biFunction = (message, count) -> {
			int resultCount = count + 10;
			return "Message = " + message + ", Count = " + resultCount;
		};
		
		System.out.println(biFunction.apply("java", 77));
	}
}
