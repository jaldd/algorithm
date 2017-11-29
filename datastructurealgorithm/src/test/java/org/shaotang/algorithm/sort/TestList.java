package org.shaotang.algorithm.sort;

import org.shaotang.algorithm.link.LinkList;

public class TestList {

	public static void main(String[] args) {
		LinkList ll=new LinkList();
		ll.insert(1);
		ll.insert(111);
		ll.insert(11);
		ll.insert(12);
		ll.insert(13);
		ll.displayAll();
		ll.delete(1111);
		ll.displayAll();
	}
}
