package org.shaotang.algorithm.sort;

public class MyArray {

	protected long[] arr;
	protected int elems;
	public MyArray() {
		arr=new long[50];
	}
	public MyArray(MyArray arr) {
		super();
		this.arr = arr.arr;
		this.elems = arr.elems;
	}
	public MyArray(int max) {
		arr=new long[max];
	}
	public void insert(long value) {
		arr[elems]=value;
		elems++;
	}
	public void display() {
		for(int i=0;i<elems;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	/**
	 * 
	 * @param arr
	 * @param a
	 * @param b
	 */
	public void swap(int a,int b) {
		long tmp=0l;
		tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
	}
}
