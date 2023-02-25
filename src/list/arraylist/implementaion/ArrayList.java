package list.arraylist.implementaion;

import java.util.ListIterator;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];

	public boolean addFirst(Object element) {
		return add(0, element);
	}

	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}

	// 뒤로 복사 하나씩하고 메서드에 넘어온 index에 element 값 덮어쓰기
	public boolean add(int index, Object element) {
		// 7
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}

	public Object remove(int index) {
		Object removed = elementData[index];
		for (int i = index + 1; i <= size - 1; i++) {
			elementData[i - 1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
	}

	public Object removeFirst() {
		return remove(0);
	}

	public Object removeLast() {
		return remove(size - 1);
	}

	public Object get(int index) {
		return elementData[index];
	}

	public int size() {
		return size;
	}

	public int indexOf(Object element) {
		for (int i = 0; i < size; i++) {
//			if (elementData[i] == element) {
			if (element.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1) {
				str += ", ";
			}
		}
		return str + "] size = " + size();
	}

	public ListIterator listIterator() {
		return new ListIterator();
	}

	class ListIterator {

		private int nextIndex = 0;

		public boolean hasNext() {
			return nextIndex < size();
		}

		public Object next() {
//			Object returnData = elementData[nextIndex];
//			nextIndex++;
//			return returnData;
			return elementData[nextIndex++];
		}

		public Object previous() {
			return elementData[--nextIndex];
		}

		public boolean hasPrevious() {
			return nextIndex > 0;
		}
	}

}
