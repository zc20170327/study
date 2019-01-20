package test;

import car.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car(80);
		System.out.println("加速后，速度为"+car.SpeedUp(10, 20));
		System.out.println("减速后，速度为"+car.SpeedUp(-10, 20));
	}

}
