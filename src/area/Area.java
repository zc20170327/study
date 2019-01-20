package area;

public class Area {
	public  double computeArea(double r) {
		double area=Math.PI*r*r;
		System.out.println("半径为"+r+"的圆的面积是"+area);
		return  area;
	}
	public int  computeArea(int x,int y) {
		int area=x*y;
		System.out.println("长为"+x+"宽为"+y+"的矩形的面积为"+area);
		return area;
	}
	public float computeArea(float a,float h) {
	float area=a*h/2;
	System.out.println("底为"+a+"高为"+h+"的三角形面积是"+area);
	return area;
	}
	public float computeArea(int a,int b,float h) {
		float area=(a+b)*h/2;
		System.out.println("上底为"+a+"下底为"+b+"高为"+h+"的梯形面积是"+area);
		return  area;
	}
}
