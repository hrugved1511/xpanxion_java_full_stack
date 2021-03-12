package com.xpanxion.udemycourse;

public class oop_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("closed","on","seated",12);
		/*
		car.setDoors("closed");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(20);
		*/
		
		System.out.println(car.run());

	}

}