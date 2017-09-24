package com.xxh.testFirst;

public class Daffodil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100;i <= 999;i++ ){
			
			int one = i % 10;
			int ten = i /10 %10;
			int hundred = i /10 /10 %10;
			if (one*one*one + ten*ten*ten + hundred*hundred*hundred == i)
				System.out.println("水仙花数为：" +i);
		}
	}

}
