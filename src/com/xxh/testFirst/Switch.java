package com.xxh.testFirst;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件类型：");

		String type = sc.next();
		switch (type) {

		case "txt":
			System.out.println("正在处理" + type);
			break;
		case "pdf":
			System.out.println("正在处理" + type);
			break;
		default:
			System.out.println("不支持" + type+"格式");
			
		}

	}
}
