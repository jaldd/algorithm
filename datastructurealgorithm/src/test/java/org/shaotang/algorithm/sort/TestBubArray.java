package org.shaotang.algorithm.sort;

import org.junit.Test;

public class TestBubArray {

	public static MyArray arr = new MyArray();
	static {
		arr.insert(20);
		arr.insert(18);
		arr.insert(23);
		arr.insert(15);
		arr.insert(17);
		arr.insert(11);
		arr.insert(21);
		arr.insert(60);
		arr.insert(5);
		arr.insert(4);
		arr.insert(1);
		arr.insert(88);
		arr.display();
	}

	@Test
	public void testBubSort() {
		BubSort bubSort = new BubSort(arr);
		bubSort.bubbleSort();
		bubSort.display();
	}
	@Test
	public void testSelectSort() {
		SelectSort selectSort=new SelectSort(arr);
		selectSort.selectSort();
		selectSort.display();
	}
	@Test
	public void insertSort() {
		InsertSort insertSort=new InsertSort(arr);
		insertSort.insertSort();
		insertSort.display();
	}

	
	
	
	
	
	public static void main(String[] args) {

		short i = -20;
		System.out.println("1 << 1 = " + (1 << 1));
		System.out.println("1 << 2 = " + (1 << 2));
		System.out.println("1 << 3 = " + (1 << 3));

		System.out.println("8 >> 1 = " + (8 >> 1));
		System.out.println("8 >> 2 = " + (8 >> 2));
		System.out.println("8 >> 3 = " + (8 >> 3));

		System.out.println("-8 >> 1 = " + (-8 >> 1));
		System.out.println("-8 >> 2 = " + (-8 >> 2));
		System.out.println("-8 >> 3 = " + (-8 >> 3));

		System.out.println("-8 >>> 1 = " + (-8 >>> 1));
		System.out.println("-20 >>> 2 = " + (i >>> 2));
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));

		System.out.println("8 >>> 1 = " + (8 >>> 1));
		System.out.println("8 >>> 2 = " + (8 >>> 2));
		System.out.println("8 >>> 3 = " + (8 >>> 3));

	}
}
