package aroundhubstudio.optional;

import java.util.*;

public class NPESample {

	private Scanner scanner;

	public NPESample() {
		try {
			int a = scanner.nextInt();
		} catch (NullPointerException e) {
			System.out.println("NPE발생");
//			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new NPESample();
	}
}
