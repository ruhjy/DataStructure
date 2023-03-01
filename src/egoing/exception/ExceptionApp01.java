package egoing.exception;

public class ExceptionApp01 {
	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("잘못된 계산입니다.");
		}
		System.out.println(3);
	}
}
