package test;

import area.Area;

public class AreaTest {

	public static void main(String[] args) {		
		Area area=new Area();
		area.computeArea(2.5f);
		area.computeArea(3, 5);
		area.computeArea(5.0f, 2.5f);
		area.computeArea(3, 5, 3.5f);	
	}

}
