package org.shaotang.algorithm.sort;

public class InsertSort extends MyArray{

	public InsertSort(MyArray arr) {
		super(arr);
	}
	
	public InsertSort() {
		
	}
	
	public void insertSort() {
		long select=0;
		for(int i=1;i<elems;i++) {
			select=arr[i];
			int j=0;
			for(j=i;j>0&&arr[j-1]>=select;j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=select;
		}
	}
	
	
}
