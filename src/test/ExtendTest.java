package test;

import vehicle.Car;

public class ExtendTest {
	public static void main(String[] args) {
		Car car=new Car();
		System.out.println("car name"+car.name);
		car.move();
		car.function();
	}
}
