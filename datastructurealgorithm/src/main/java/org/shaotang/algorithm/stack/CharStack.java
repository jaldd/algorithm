package org.shaotang.algorithm.stack;

public class CharStack {

	private int maxSize;
	private char[] arr;
	private int top;
	public CharStack() {
		
	}
	public CharStack(int maxSize) {
		super();
		this.maxSize = maxSize;
		arr=new char[maxSize];
		top=0;
	}
	//压入数据
	public void push(char value) {
		arr[top++]=value;
	}
	//弹出数据
	public long pop() {
		return arr[--top];
	}
	public long peek() {
		return arr[top-1];
	}
	public boolean isEmpty() {
		return top==0;
	}
	public boolean isFull() {
		return top==maxSize;
	}
	
}
