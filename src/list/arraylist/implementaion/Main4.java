package list.arraylist.implementaion;

public class Main4 {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);

		ArrayList.ListIterator li = numbers.listIterator();

		while (li.hasNext()) {
			System.out.print(li.next() + " "); // 10 20 30 40
		}
		System.out.println();
		System.out.println("==========");

		while (li.hasPrevious()) {
			System.out.print(li.previous() + " "); // 40 30 20 10
		}
		System.out.println();
	}

}
