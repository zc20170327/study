package vehicle;

public class Car extends Vehicles{
	private String model;
	public Car() {
		model="家用车";
		System.out.println("constractor in car ");
		
	}
	public  void move() {
		System.out.println("move  in Car ");
		
	}
	public  void function () {
		System.out.println("function in Car name "+this.name+"filed"+getFiled()+"model:"+this.model);
	}
}
