package org.shaotang.algorithm.sort;

import org.junit.Test;
import org.shaotang.algorithm.stack.MyStack;

public class TestStack {

	@Test
	public void testStack() {
		MyStack stack=new MyStack(5);
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(9);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
