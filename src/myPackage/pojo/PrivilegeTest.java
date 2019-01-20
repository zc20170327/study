package myPackage.pojo;

import myPackage.pojo.PrivilegeData;

public class PrivilegeTest {
	public static void main(String[] args) {
		PrivilegeData data=new PrivilegeData();
		System.out.println("原来的值"+data.toString());
		data.str="bye";
	}
}
