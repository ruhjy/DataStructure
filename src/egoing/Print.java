package egoing;

class Print {
	String delimiter = "";
	
	// 생성자와 this
	Print(String delimiter) {
		this.delimiter = delimiter;
		
	}
	void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
