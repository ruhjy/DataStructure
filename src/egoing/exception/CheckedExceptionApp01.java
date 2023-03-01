package egoing.exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp01 {
	public static void main(String[] args) {
		// FileWriter는 checkedException 반드시 예외 처리해야함. try/catch or throws
		try {
			FileWriter f = new FileWriter("data.txt");
			f.write("Hello");
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}