package chap11;

public class AbstractVehicleTest {

	public static void main(String[] args) {
		//Vehicle v=new Vehicle("boat");	//创建抽象类对象
		//Vehicle[] arrayOfVehicle={new Train("train"),new Ship("ship"),new Airplane("Airplane")} ;
		Vehicle[] arrayOfVehicle= {new Train("train"),new Ship("ship"),new Airplane("Airplane")};
		for (int i=0;i<arrayOfVehicle.length;i++) {
			arrayOfVehicle[i].speed();
			System.out.println(arrayOfVehicle[i].transport());
		}
	}

}
