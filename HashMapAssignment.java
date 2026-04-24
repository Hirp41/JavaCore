package com.assignment.module1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmapassignment {
	
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "atul");
		hm.put(2,"Ferin");
		hm.put(3, "Sahil");
		hm.put(4, "soham");
		hm.put(5, "Naufil");
		hm.put(6, "sanket");
		
		System.out.println(hm);
		System.out.println(hm.get(2));
		
		Set set=hm.entrySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}