package egoing.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource01 {
	public static void main(String[] args) {
		// try with resource statements
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");
//			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}