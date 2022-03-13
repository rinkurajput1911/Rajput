package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist1 {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		System.out.println(ll.size()); // default size
		ll.add("abc");
		ll.add(100);
		ll.add('A');
		ll.add(55.6f);
		ll.add(100);
		ll.add(null);
		ll.add(null);

		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(null));
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(2));

		System.out.println(ll);
		// add info in between linkedlist
		ll.add(4, 500);
		System.out.println(ll);

		// remove/delete info in between linkedlist
		ll.remove(4);
		System.out.println(ll);

		// update/modify
		ll.set(0, "xyz");
		System.out.println(ll);

		System.out.println("---------print linkedlist data using iterator cursor------------");

		Iterator itr = ll.iterator();
		while (itr.hasNext()) // TRUE true fllse
		{
			System.out.println(itr.next());
		}

		System.out.println("---------print linkedlist data using ListIterator cursor------------");

		ListIterator litr = ll.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("---------print linkedlist data using for loop------------");

		for (int i = 0; i <= ll.size() - 1; i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("---------print linkedlist data using foreach loop------------");

		for (Object s1 : ll) {
			System.out.println(s1);
		}

	}

}
