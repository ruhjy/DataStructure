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
	}

}
