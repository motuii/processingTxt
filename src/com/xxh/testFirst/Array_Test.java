package com.xxh.testFirst;

import java.util.Scanner;

public class Array_Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ӧ���ڷ�Χ(1~7)");
		int week = sc.nextInt();
		System.out.println("����" + getWeek(week));
	}

	public static char getWeek(int week) {

		char[] arr = {' ','һ','��','��','��','��','��','��',};
		return arr[week];
	}
}
