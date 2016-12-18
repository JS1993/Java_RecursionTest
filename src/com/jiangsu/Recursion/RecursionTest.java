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
	 */
	public static void method2(){
		
	}

}
