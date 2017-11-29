package org.shaotang.algorithm.link;

public class LinkList {

	private Link first;

	public void insert(long value) {
		Link link = new Link(value);
		if (first == null) {
			first = link;
		} else {
			link.setNext(first);
			first = link;
		}
	}

	public void displayAll() {
		Link current = first;
		while (current != null) {
			System.out.print(current.getData()+" ");
			current = current.getNext();
		}
		System.out.println();
	}

	// 查找节点
	public Link find(long key) {
		Link current = first;
		while (current.getData() != key) {
			if (current.getNext() == null) {
				return null;
			}
			current = current.getNext();
		}
		return current;
	}

	// 插入节点到指定位置
	public void insert(long value, int position) {
		if (position == 0) {
			insert(value);
		} else {
			Link current = first;
			for (int i = 0; i < position - 1; i++) {
				current = current.getNext();
			}
			Link link = new Link(value);
			link.setNext(current.getNext());
			current.setNext(link);
		}
	}

	// 删除指定节点
	public void delete(long key) {
		if (first.getData() == key) {
			first = null;
		} else {
			Link current = first;
			while (current.getNext() != null) {
				if (current.getNext().getData() == key) {
					current.setNext(current.getNext().getNext());
				} else {
					current=current.getNext();
				}
			}
		}
	}
}
