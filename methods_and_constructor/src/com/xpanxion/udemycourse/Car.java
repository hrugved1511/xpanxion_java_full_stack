package com.xpanxion.udemycourse;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car() {
		doors = "opened";
		engine = "off";
		driver ="absent";
		speed = 0;
	}
	
	public Car(String doors, String engine, String driver, int speed) {
		super();
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	public  void setSpeed(int speed) {
		this.speed = speed;
	}
	public  int getSpeed() {
		return speed;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && speed >0 && driver.equals("seated")) {
			return "running";
		}else {
			return "not running";
		}
	}

}
