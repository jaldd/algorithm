package org.shaotang.algorithm.digui;

public class Fibonacci {

	public int fibonacci(int n) {
		if(n==1||n==2) {
			return 1;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void main(String[] args) {
		System.out.println(new Fibonacci().fibonacci(10));
	}
}
