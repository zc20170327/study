package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class MapTest {
	private Map map;
	private MapTest() {
		map=new  HashMap<>();
		
	}
	public static void main(String[] args) {
		MapTest mapTest=new MapTest();
		mapTest.addSign();
		mapTest.showSign();
	}
	public void  addSign() {
		Scanner scan=new Scanner(System.in);
		int i=1;
		while(i<=3) {
			System.out.println("请输入学生的ID(1600~1603)");
			String ID=scan.next();
			Object name=map.get(ID);
			if(name==null) {
				System.out.println("请输入学生的姓名");
				name=scan.next();
				map.put(ID, name);
				System.out.println(name+"已签到");
				i++;
			}else {
				System.out.println(ID+"已存在，学生"+name+"已签到");
				continue;
			}
		}
	}
	public void showSign() {
		Set keySet=map.keySet();
		Iterator it=keySet.iterator();
		System.out.println("已签到的学生如下:");
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println("学生的ID:"+key+"学生名称:"+value);
		}
	}
}
