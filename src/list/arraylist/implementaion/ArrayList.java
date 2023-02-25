package list.arraylist.implementaion;

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
		for (int i = index + 1; i < size; i++) {
			elementData[i - 1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
	}

	public int size() {
		return size;
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
}
