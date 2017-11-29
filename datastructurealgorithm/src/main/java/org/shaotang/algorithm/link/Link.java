package org.shaotang.algorithm.link;

public class Link {
	private long data;
	private Link next;
	public Link() {
		
	}
	public Link(long data) {
		this.data = data;
	}
	public long getData() {
		return data;
	}
	public void setData(long data) {
		this.data = data;
	}
	public Link getNext() {
		return next;
	}
	public void setNext(Link next) {
		this.next = next;
	}
}
