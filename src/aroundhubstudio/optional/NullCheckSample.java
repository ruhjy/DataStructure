package aroundhubstudio.optional;

import java.util.*;

public class NullCheckSample {

	private Scanner scanner;

	public NullCheckSample() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		int a = scanner.nextInt();
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new NullCheckSample();
	}
}
