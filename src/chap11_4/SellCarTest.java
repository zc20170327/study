package chap11_4;

public class SellCarTest {
	private int total;
	private int getTotal() {
		return  total;
	}
	public  void setTotal(int total) {
		this.total=total;
	}
	public  void sellCar(Car car ) {
		System.out.println("车型"+car.getName()+"单价:"+car.getPrice());
		total=total+car.getPrice();
	}
	public static void main(String[] args) {
		BMW b1=new BMW();
		BMW b2=new BMW();
		b1.welcome();
		b1.welcome("BMW");
		SellCarTest shop=new SellCarTest();
		Car[] cars=new Car[2];
		cars[0]=new QQCar();
		cars[1]=b1;
		for(int  i=0;i<cars.length;i++) {
			shop.sellCar(cars[i]);
		}
		shop.sellCar(b2);
		System.out.println("总收入:"+shop.getTotal());
	}

}
