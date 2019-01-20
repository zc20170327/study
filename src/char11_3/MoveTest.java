package char11_3;

public class MoveTest {
	public static void main(String[] args) {
		System.out.println("向上转型体现方式1:父对象作为方法参数");
		Car c=new Car();
		c.drive(new BMW());
		c.drive(new QQCar());
		System.out.println("向上转型二:申明父类对象");
		Car[] cars= {new BMW(),new QQCar()};
		for(int  i=0;i<cars.length;i++) {
			cars[i].move();
			}
	}
}
