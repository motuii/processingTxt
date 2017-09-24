package com.xxh.testFirst;

import java.util.Scanner;

public class Array_Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入对应星期范围(1~7)");
		int week = sc.nextInt();
		System.out.println("星期" + getWeek(week));
	}

	public static char getWeek(int week) {

		char[] arr = {' ','一','二','三','四','五','六','日',};
		return arr[week];
	}
}
