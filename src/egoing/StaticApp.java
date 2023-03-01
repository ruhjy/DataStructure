package egoing;

class Foo {
	static String classVar = "I class var";
	String instanceVar = "I instance var";
	
	static void classMethod() {
		System.out.println(classVar); // Ok
//		System.out.println(instanceVar); // Error
	}
	
	void instanceMethod() {
		System.out.println(classVar); // Ok
		System.out.println(instanceVar); // Ok
	}
}

class StaticApp {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); // Ok
//		System.out.println(Foo.instanceVar); // Error
		Foo.classMethod();
//		Foo.instanceMethod(); // Error
		System.out.println();
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		System.out.println();
		
		f1.classVar = "change by f1";
		System.out.println(Foo.classVar); // change by f1
		System.out.println(f2.classVar); // change by f1
		System.out.println();
		
		f1.instanceVar = "change by f1";
		System.out.println(f1.instanceVar); // change by f1
		System.out.println(f2.instanceVar); // I instance var
	}
}
