package lambda;

import java.util.function.*;

public class Ex14_000 {
	public static void main(String[] args) {

//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//		Function<String, Integer> f = 클래스이름::메서드이름;
		Function<String, Integer> f = Integer::parseInt; // 메서드 참조
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s); // 람다로 바꾸기
		System.out.println(f.apply("100") + 300);

//		Supplier<MyClass> s = ()-> new MyClass();
		Supplier<MyClass> s = MyClass::new; // 메서드 참조
		System.out.println(s.get());

		MyClass mc = s.get();
		System.out.println(mc);

//		Function<Integer, MyClass01> m1 = (i) -> new MyClass01(i);
		Function<Integer, MyClass01> m1 = MyClass01::new; // 메서드 참조
		MyClass01 mc1 = m1.apply(200);
		System.out.println(mc1.iv);
		System.out.println(m1.apply(300).iv);

//		Function<Integer, int[]> arr = i -> new int[i];
		Function<Integer, int[]> arr = int[]::new; // 메서드 참조
		System.out.println(arr.apply(100).length);
		System.out.println();


	}
}

class MyClass {

}

class MyClass01 {
	int iv;

	MyClass01(int iv) {
		this.iv = iv;
	}
}