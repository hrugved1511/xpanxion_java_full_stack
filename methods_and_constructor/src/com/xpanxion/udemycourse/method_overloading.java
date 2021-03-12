package com.xpanxion.udemycourse;

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Area of rectangle is "+area(3.4,4.5));
		System.out.println("Area of Square is "+area(5.0));

	}
	
	public static double area(double length,double width) {
		return length*width;
	}
	
	public static double area(double side) {
		return side*side;
	}

}
