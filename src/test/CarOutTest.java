package test;

import carOut.CarOut;
import carOut.CarOut.EnginnerInner;

public class CarOutTest {
	public static void main(String[] args) {
		CarOut c=new CarOut ();	//创建外部类对象
		CarOut.EnginnerInner enginnerInner=c.new EnginnerInner ();  
		enginnerInner.run();
		
	}
}	
