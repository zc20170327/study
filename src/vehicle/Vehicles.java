package vehicle;

public class Vehicles {
	public  String name;
	private  String filed;
	public  Vehicles() {
		filed="陆";
		name="交通工具";
		System.out.println("constructor in vehicle");
	}
	public String  getFiled() {
		return  filed;
	}
	public  void move() {
		System.out.println("move in vehicle");
	}
}
