package com.xpanxion.udemycourse;

public class methods_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(primeNumber(23));

	}
	
	public static boolean primeNumber(int number) {
		boolean isPrime = true;
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

}
