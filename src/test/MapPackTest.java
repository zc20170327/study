package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapPackTest {
	public static void main(String[] args) {
		Map m=new HashMap<>();
		Random random=new Random();
		for (int i=0;i<10000;i++) {
			int  r=random.nextInt(10);
			Integer num=(Integer)m.get(r);
			m.put(r,num==null?1:num+1);
		}
		System.out.println(m);
	}
}
