package list.arraylist.implementaion;

public class Main3 {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);

		ArrayList.ListIterator li = numbers.listIterator();
		System.out.println(li.next()); // 10
		System.out.println(li.next()); // 20
		System.out.println(li.next()); // 30
		System.out.println(li.next()); // 40
		System.out.println("==========");
		System.out.println(li.previous()); // 40
		System.out.println(li.previous()); // 30
		System.out.println(li.previous()); // 20
		System.out.println(li.previous()); // 10
//		ArrayIndexOutOfBoundsException
//		System.out.println(li.previous()); 
		System.out.println(li.hasPrevious());

	}

}
