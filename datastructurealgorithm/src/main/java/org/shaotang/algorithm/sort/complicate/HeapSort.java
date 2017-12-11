package org.shaotang.algorithm.sort.complicate;

public class HeapSort {
	public static void heapSort(DataWrap[] data) {
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		// ѭ������
		for (int i = 0; i < arrayLength - 1; i++) {
			// ����
			builMaxdHeap(data, arrayLength - 1 - i);
			// �����Ѷ������һ��Ԫ��
			swap(data, 0, arrayLength - 1 - i);
			System.out.println(java.util.Arrays.toString(data));
		}
	}

	private static void builMaxdHeap(DataWrap[] data, int lastIndex) {
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			int k = i;
			while (k * 2 + 1 <= lastIndex) {
				int biggerIndex = 2 * k + 1;
				if (biggerIndex < lastIndex) {
					if (data[biggerIndex].compareTo(data[biggerIndex + 1]) < 0) {
						biggerIndex++;
					}
				}
				if (data[k].compareTo(data[biggerIndex]) < 0) {
					swap(data, k, biggerIndex);
					k = biggerIndex;
				} else {
					break;
				}
			}
		}
	}

	private static void swap(DataWrap[] data, int i, int j) {
		DataWrap temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	public static void main(String[] args) {
		DataWrap[] data = { new DataWrap(9, ""), new DataWrap(-16, ""), new DataWrap(21, "*"), new DataWrap(23, ""),
				new DataWrap(-30, ""), new DataWrap(-49, ""), new DataWrap(21, ""), new DataWrap(30, "*"),
				new DataWrap(30, "") };
		System.out.println(java.util.Arrays.toString(data));
		heapSort(data);
		System.out.println(java.util.Arrays.toString(data));
	}
}
