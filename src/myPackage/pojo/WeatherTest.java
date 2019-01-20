package myPackage.pojo;

public class WeatherTest {

	public static void main(String[] args) {
		Weather weather=new Weather("晴",25,10,3);
		weather.printWeather();
		weather.setWeather("阴", 22,13, 4);
		weather.printWeather();
	}

}
