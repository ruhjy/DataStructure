package functionalinterface.functional;

public class SampleCalled {
	public static void main(String[] args) {
		
		CustomFunctionalInterface customInterface = System.out::println;
//		CustomFunctionalInterface customInterface = (message) -> System.out.println(message);
//		CustomFunctionalInterface customInterface = (String message) -> {
//			System.out.println(message);
//		};
		
		String message = "hello java~";
		customInterface.called(message);
		
		customInterface.printHello();
	}
}
