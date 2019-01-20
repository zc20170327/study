package chap11_2;

public class AirPlane extends Vehicle implements RefuelInterface{

	@Override
	public void refuel() {
		System.out.println("running  refuel () in  Airplane");
		
	}

}
