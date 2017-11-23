package org.shaotang.algorithm.sort;

import org.junit.Test;
import org.shaotang.algorithm.queue.PriorityQueue;
import org.shaotang.algorithm.queue.Queue;

public class TestQueue {

	@Test
	public void testQueue() {
		Queue q=new Queue(5);
		q.insert(5);
		q.insert(3);
		q.insert(5);
		q.insert(7);
		q.insert(7);
		q.insert(9);
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}
	@Test
	public void testPriorityQueue() {
		PriorityQueue q=new PriorityQueue(5);
		q.insert(5);
		q.insert(3);
		q.insert(5);
		q.insert(7);
		q.insert(7);
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}
}
