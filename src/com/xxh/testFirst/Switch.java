package com.xxh.testFirst;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ����ͣ�");

		String type = sc.next();
		switch (type) {

		case "txt":
			System.out.println("���ڴ���" + type);
			break;
		case "pdf":
			System.out.println("���ڴ���" + type);
			break;
		default:
			System.out.println("��֧��" + type+"��ʽ");
			
		}

	}
}
