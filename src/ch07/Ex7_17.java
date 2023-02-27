package ch07;

public class Ex7_17 {
	Object iv = new Object() {
		void method() {
		}
	};

	static Object cv = new Object() {
		void method() {
		}
	};

	void method() {
		Object iv = new Object() {
			void method() {
			}
		};
	}
}