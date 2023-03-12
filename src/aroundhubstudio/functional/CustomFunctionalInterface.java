package aroundhubstudio.functional;

@FunctionalInterface
public interface CustomFunctionalInterface {

	void called(String message);
	
	default void printHello() {
		System.out.println("hello functional");
	}
}
