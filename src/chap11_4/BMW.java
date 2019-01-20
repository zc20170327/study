package chap11_4;

public class BMW extends Car{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 300000;
	}
	public  void  welcome(String name) {
		System.out.println("welcome to"+name+"4s");
	}
	public  void welcome() {
		System.out.println("welcome to 4s");
	}

}
