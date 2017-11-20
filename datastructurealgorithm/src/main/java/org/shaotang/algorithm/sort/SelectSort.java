package org.shaotang.algorithm.sort;

public class SelectSort extends MyArray{

	public SelectSort() {
		
	}
	public SelectSort(MyArray arr) {
		super(arr);
	}

	public void selectSort() {
		int min=0;
		for(int i=0;i<elems-1;i++) {
			min=i;
			for(int j=i+1;j<elems;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				swap(min,i);	
			}
		}
	}
}
