package com.xpanxion.udemycourse;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop(1,10);
		System.out.println("**************************");
		loop(20,40);
		
		
	}
	
	public static void loop(int start,int end) {
		
		while(start<=end) {
			System.out.println(start);
			start++;
		}
	}
	
}
