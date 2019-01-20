package chap11;

abstract class Vehicle {
	protected String name;
	public abstract void speed();
	public String transport() {
		if(name.equals("train")) {
			return "onland";
		}
		if(name.equals("ship")) {
			return  "by sea";
		}
		if(name.equals("Airplane")) {
			return "by air";
		}
		
		return "neither";
	}
}
