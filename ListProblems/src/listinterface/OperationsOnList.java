package listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationsOnList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		add(list);
		print(list);
		remove(list);
	    update(list);
	}

	private static void update(List<Integer> list  ) {
		Iterator<Integer> it = list.iterator();
		for (int i = 0; i <= list.size() - 1; i++) {
			if (list.get(i) % 2 != 0) {
				list.set(i, list.get(i) * 10);
			}
		}
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	private static void remove(List<Integer> list ) {
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			if (i.next() % 2 == 0) {
				System.out.print(i.next() + " ");
			}
		}
		System.out.println();
	}

	private static void print(List<Integer> list ) {
		Iterator<Integer> i = list.iterator();
 		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println();
	}

	private static void add(List<Integer> list) {
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
	}
}
