package org.shaotang.algorithm.stack;

public class Reverse {
	public String input;
	public Reverse(String input) {
		super();
		this.input = input;
	}
	public String doReverse() {
		CharStack ncs=new CharStack(input.length());
		for(int i=0;i<input.length();i++) {
			ncs.push(input.charAt(i));
		}
		String output="";
		while(!ncs.isEmpty()) {
			output+=ncs.pop();
		}
		return output;
	}
}
