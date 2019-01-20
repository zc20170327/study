package chap11;

public class Airplane extends Vehicle{
	public Airplane(String name) {
		super.name=name;
	}
	@Override
	public void speed() {
		System.out.println("method  in Airplane,speed =100km/h");
	}

}
