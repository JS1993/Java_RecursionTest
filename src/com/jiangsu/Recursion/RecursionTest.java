package com.jiangsu.Recursion;

import java.math.BigInteger;

public class RecursionTest {

	/**
	 * 求1000阶乘所有0和尾部0的个数
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1;i<1000;i++){
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);
		}
		System.out.println(bi1);
		String str = bi1.toString();
		method1(str);
	}
	
	/**
	 * 方式一：不用递归实现
	 */
	public static void method1(String str){
		//全部0
		int count = 0;
		for(int i = 0 ;i<str.length();i++){
			if('0'==str.charAt(i)){
				count++;
			}
		}
		System.out.println("0的个数为："+count);
		
		//尾部0
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();   				//反转字符串
		int count2 = 0;
		for(int i = 0; i<str.length();i++){
			if('0' != str.charAt(i)) {
				break;
			}else{
				count2++;
			}
		}
		System.out.println("尾部0的个数为"+count2);
	}
	
	/**
	 * 方式二：使用递归实现
	 * 分析：5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 
	 * 1000/5 = 200
	 * 200/5 = 40
	 * 40/5 = 8
	 * 8/5 = 1
	 * 共：200+40+8+1=249个0
	 */
	public static int method2(int num){
		if(num>0&&num<5){
			return 0 ;
		}else{
			return num/5+method2(num/5);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
