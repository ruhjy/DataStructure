package list.arraylist.implementaion;

public class Main5 {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);

		ArrayList.ListIterator li = numbers.listIterator();
		while (li.hasNext()) {
			int number = (int) li.next();
			if (number == 30) {
				li.add(35);
			}
		}
		System.out.println(numbers);
	}

}
