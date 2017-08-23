package testjunit;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[]) {
		LinkedList<String> linked = new LinkedList<String>();
		
		linked.add("uno");
		linked.add("dos");
		linked.add("tres");
		linked.add("tres2");		
		linked.add("tres");
		
		System.out.println(linked);
		
		linked.addFirst("cero");
		linked.addLast("cuatro");
		System.out.println(linked);
		linked.push("cinco");
		linked.addFirst("menosuno");
		System.out.println(linked);
		System.out.println(linked.pollFirst());
		linked.removeFirstOccurrence("tres");
		System.out.println(linked);
	}

}
