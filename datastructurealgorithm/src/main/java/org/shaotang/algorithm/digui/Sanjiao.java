package org.shaotang.algorithm.digui;

public class Sanjiao {

	public static void main(String[] args) {
		System.out.println(new Sanjiao().sanjiaoDigui(3));
	}
	public int sanJiao(int n) {
		int total=0;
		while(n>0) {
			total=total+n;
			n--;
		}
		return total;
	}
	
	public int sanjiaoDigui(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+sanjiaoDigui(--n);
		}
	}
}
