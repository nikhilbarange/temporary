package selenium;

import java.util.LinkedList;

public class PracticeLinkedList {
	
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add("Arise");
		a.add(34);
		a.add('$');
		a.add(null);
		a.add(null);
		a.add("Arise");
		System.out.println(a.get(5));
	}

}
