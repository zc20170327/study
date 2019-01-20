package myPackage.pojo;

public class PrivilegeData {
	String str;
	int num1;
	int num2;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "PrivilegeData [str=" + str + ", num1=" + num1 + ", num2=" + num2 + "]";
	}
	public  PrivilegeData() {
		str="hello";
		num1=0;
		num2=0;
	}
}
