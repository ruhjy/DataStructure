package aroundhubstudio.sample;

import java.util.function.*;

public class SupplierSample {
	public static void main(String[] args) {
		
		Supplier<String> getMessage = () -> "hello world~";
		System.out.println(getMessage.get());
		
		Supplier<Integer> score = () -> 100; 
		System.out.println(score.get());
	}
}
