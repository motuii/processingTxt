package com.xxh.testFirst;
import java.util.Scanner;
public class Test_If {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的年龄");
		int age = sc.nextInt();
		
		if (age >= 18){
			System.out.println("您已成年，可以浏览本网站");
		}
		else{
			System.out.println("本网站内容不适合未成年人访问");
		}
	}
}
