package carOut;

public class CarOut {
	private int door;
	private int  windows;
	private int  wheels;
	public class EnginnerInner{
		private String type;
		private int driver;
		public void run() {
			System.out.println("调用EnginnerInner类run()方法");
		}
	}
}
