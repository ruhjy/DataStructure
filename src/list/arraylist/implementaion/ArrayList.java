package list.arraylist.implementaion;

import java.util.Arrays;

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

	public boolean add(int idx, Object element) {
		for (int i = size - 1; i >= idx; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[idx] = element;
		size++;
		return true;

	}

	public Object remove(int idx) {
		Object removed = elementData[idx];
		for (int i = idx + 1; i <= size - 1; i++) {
			elementData[i - 1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
	}

	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1)
				str += ", ";
		}
		return str + "] size = " + size();
	}

	public int size() {
		return size;
	}

}
