package chap11_2;

public class Car extends Vehicle implements RefuelInterface{

	@Override
	public void refuel() {
		System.out.println("running  refuel() in car ");
		
	}

}
