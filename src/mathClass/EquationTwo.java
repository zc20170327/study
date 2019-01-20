package mathClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquationTwo {
	private String s="";
	private double temp,a,b,c,r1,r2;
	private int i=0;
	/**
	 * 用户输入一元二次方程的系数
	 * @return
	 */
	public double inPut() {
		System.out.println("请输入一元二次方程的系数"+(char)('a'+i));
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		try {
			s=bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		temp=Double.parseDouble(s);
		i++;
		return  temp;
	}
	public void operation() {
		a=inPut();
		b=inPut();
		c=inPut();
		r1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		r2=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("该一元二次方程的根为"+r1+"和"+r2);
	}
}
