package org.shaotang.algorithm.digui;

public class DiGui {

	public static void main(String[] args) {
		new DiGui().digui(0);
	}
	public void digui(int i) {
		if(i<10) {
			System.out.println("hello"+i);
			digui(++i);
			System.out.println("hi"+i);
		}
	}
}
