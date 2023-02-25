package list.arraylist.implementaion;

public class Main2 {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("========");

		// Iterator
		ArrayList.ListIterator li = numbers.listIterator();
		System.out.println(li.next()); // 10
		System.out.println(li.next()); // 20
		System.out.println(li.next()); // 30
		System.out.println(li.next()); // 40
		System.out.println(li.next()); // null
		System.out.println(li.next()); // null
		System.out.println("========");
		
		// Iterator 패턴( hasNext(), next() )
		li = numbers.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
