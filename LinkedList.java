package com.assignment.module1;

import java.util.LinkedList;

public class Linkeddlist {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.remove();
		l.add(2, 7);
		l.add("Linked list");
		l.add("time");
		l.addFirst("tops");
		l.addLast("a1");
		l.remove();
		l.addFirst("tops");
		
		System.out.println(l);
	}

}