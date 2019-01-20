package myPackage.pojo;

public class Weather {
	private String str;
	private int temperator;
	private int humidity;
	private int wind;
	public Weather(String s,int t,int h,int w) {
		temperator=t;
		humidity=h;
		wind=w;
		str=s;
	}
	public void setWeather(String s,int t,int h,int w) {
		temperator=t;
		str=s;
		humidity=h;
		wind=w;
	}
	public  void printWeather() {
		System.out.println("今晚的天气"+str+",温度"+temperator+",湿度"+humidity+"风力"+wind);
	}
}
