package org.shaotang.algorithm.money;

import java.util.Scanner;

public class MoneyConverter {

	private static char[] units=new char[] {'圆','拾','佰','仟','万','拾','佰','仟','亿'};
	private static char[] data=new char[] {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int money=s.nextInt();
		System.out.println(convert(money));
	}
	public static String convert(int money) {
		StringBuffer sb=new StringBuffer("整");
		int init=0;
		while(money!=0) {
			sb.insert(0, units[init++]);
			int number=money%10;
			sb.insert(0, data[number]);
			money/=10;
		}
		return sb.toString();
	}
}
