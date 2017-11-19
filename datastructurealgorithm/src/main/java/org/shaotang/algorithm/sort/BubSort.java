package org.shaotang.algorithm.sort;

/**
 * 冒泡排序
 * @author ldd
 *
 */
public class BubSort extends MyArray{

	public BubSort() {
		
	}
	public BubSort(MyArray arr) {
		super(arr);
	}

	public void bubbleSort() {
		for(int i=0;i<elems-1;i++) {
			for(int j=0;j<elems-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(j+1,j);
				}
			}
		}
	}
	
}
