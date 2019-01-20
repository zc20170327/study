package chap11_2;

public class InterfaceTest {

	public static void main(String[] args) {
		OilDepot supply=new OilDepot();
		RefuelInterface[] obj= {new Car(),new AirPlane(),new Generator()};
		for (int  i=0;i<obj.length;i++) {
			supply.service(obj[i]);
		}
	}

}
