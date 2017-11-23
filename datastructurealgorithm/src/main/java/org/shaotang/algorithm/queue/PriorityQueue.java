package org.shaotang.algorithm.queue;

public class PriorityQueue {
	private long[] arr;
	private int maxSize;
	private int elems;

	public PriorityQueue(int maxSize) {
		this.maxSize = maxSize;
		arr = new long[maxSize];
		elems = 0;
	}

	public void insert(long value) {
		int i;
		for (i = 0; i < elems; i++) {
			if (arr[i] < value) {
				break;
			}
		}
		for (int j = elems; j > i; j--) {
			arr[j] = arr[j - 1];
		}
		arr[i] = value;
		elems++;
	}

	public long remove() {
		return arr[--elems];
	}

	public boolean isEmpty() {
		return elems == 0;
	}

	public boolean isFull() {
		return elems == maxSize;
	}

	public int size() {
		return elems;
	}
}
