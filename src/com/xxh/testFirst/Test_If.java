package com.xxh.testFirst;
import java.util.Scanner;
public class Test_If {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
		int age = sc.nextInt();
		
		if (age >= 18){
			System.out.println("���ѳ��꣬�����������վ");
		}
		else{
			System.out.println("����վ���ݲ��ʺ�δ�����˷���");
		}
	}
}
