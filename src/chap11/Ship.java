package chap11;

public class Ship extends Vehicle{
	public Ship(String name) {
		super.name=name;
	}
	@Override
	public void speed() {
		System.out.println("method in ship ,speed =90km/h");
	}
}
