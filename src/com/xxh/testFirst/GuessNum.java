package com.xxh.testFirst;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����������1-100��Χ��");
		int guessNum = (int)(Math.random()*100)+1;
		while(true){
			
			int result = sc.nextInt();
			if (result > guessNum){
				
				System.out.println("����");
			}
			else if(result < guessNum){
				
				System.out.println("С��");
			}
			else{
				
				System.out.println("����");
			}
		}
		
	}

}
