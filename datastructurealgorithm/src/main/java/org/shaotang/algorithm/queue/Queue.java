package org.shaotang.algorithm.queue;

public class Queue {
	private long[] arr;
	private int maxSize;
	private int elems;
	private int font;
	private int end;
	public Queue(int maxSize) {
		this.maxSize=maxSize;
		arr=new long[maxSize];
		elems=0;
		font=0;
		end=0;
	}
	public void insert(long value) {
		if(elems<maxSize) {
			if(end==maxSize) {
				end=0;
			}
			arr[end++]=value;
			elems++;	
		}
	}
	public long remove() {
		long value=arr[font++];
		if(font==maxSize) {
			font=0;
		}
		elems--;
		return value;
	}
	public boolean isEmpty() {
		return elems==0;
	}
	public boolean isFull() {
		return end==maxSize;
	}
	public int size() {
		return elems;
	}
}
