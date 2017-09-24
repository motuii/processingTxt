package com.xxh.testFirst;

public class gabage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<1000000; i++){
			new Mome();
		}
		
		for(int i = 1; i<1000000; i++ ){
			System.out.println("我是主进程");
		}
	}
	
}
class Mome{
	public void speak(){
		System.out.println("我是垃圾被清理了");
	}
}

