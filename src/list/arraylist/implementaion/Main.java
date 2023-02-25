package list.arraylist.implementaion;

public class Main {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.addLast(50);
		numbers.addLast(60);
		numbers.addLast(70);
		numbers.addLast(80);
//		numbers.add(1,15);
//		numbers.addFirst(5);

		System.out.println(numbers.remove(2));
		System.out.println(numbers);
		System.out.println("========");

		System.out.println(numbers.removeFirst());
		System.out.println(numbers.removeLast());
		System.out.println(numbers); // 20,40,50,60,70 size 5
		System.out.println("========");

		System.out.println(numbers.get(1)); // 40
		System.out.println("========");

		System.out.println("size = " + numbers.size()); // 5
		System.out.println(numbers.indexOf(50)); // 2
		System.out.println(numbers.indexOf(20)); // 0
		System.out.println(numbers.indexOf(70)); // 4
		System.out.println(numbers.indexOf(10)); // -1
		System.out.println("========");

	}

}
