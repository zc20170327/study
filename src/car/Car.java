package car;

public class Car {
	private int  speed=0;
	public  Car (int s) {
		this.speed=s;
	}
	/**
	 * 加速度方法
	 * @param append
	 * @param times
	 * @return
	 */
	public int SpeedUp(int append,int times) {
		speed=speed+append*times;
		System.out.println("helllo world");
		return speed;
	}
}
