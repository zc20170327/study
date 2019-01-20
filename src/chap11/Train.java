package chap11;

public class Train extends Vehicle{
	public  Train(String name) {
		super.name=name;
		}
	@Override
	public void speed() {
		System.out.println("method in Train ,speed=120km/h");
	}

}
