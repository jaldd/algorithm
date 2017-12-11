package org.shaotang.algorithm.sort.complicate;

public class BinaryInsertSort {
	public static void binaryInsertSort(DataWrap[] data) {
		int arrayLength = data.length;
		for (int i = 1; i < arrayLength; i++) {
			DataWrap temp = data[i];
			int low = 0;
			int high = i - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (temp.compareTo(data[mid]) > 0) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			for (int j = i; j > low; j--) {
				data[j] = data[j - 1];
			}
			data[low] = temp;
			System.out.println(java.util.Arrays.toString(data));
		}

	}

	public static void main(String[] args) {
		DataWrap[] data = { new DataWrap(9, ""), new DataWrap(-16, ""),
				new DataWrap(21, "*"), new DataWrap(23, ""),
				new DataWrap(-30, ""), new DataWrap(-49, ""),
				new DataWrap(21, ""), new DataWrap(30, "*"),
				new DataWrap(30, "")};
		System.out.println(java.util.Arrays.toString(data));
		binaryInsertSort(data);
		System.out.println( java.util.Arrays.toString(data));
	}
}
