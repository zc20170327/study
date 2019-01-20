package gaussian;

import java.util.Random;

public class Gaussian {
	public  void displayGaussian() {
		Random r=new Random();
		double val;
		double sum=0;
		int bell[]=new int[10];
		for(int i=0;i<100;i++) {
			val =r.nextGaussian();
			sum=sum+val;
			double t=-2;
			for(int x=0;x<10;x++,t+=0.5) {
				if(val<t) {
					bell[x]++;
					break;
				}
			}
		}
		for (int i=0;i<10;i++) {
			System.out.print(bell[i]+" ");
		}
		System.out.println();
		System.out.println("Average of values"+(sum/(100)));
		
		//输出高斯分布随机数的平均值
		for(int j=0;j<10;j++) {
			for(int x=bell[j];x>0;x--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void dispalyInt() {
		int x1=0;
		Random r1=new Random();
		for(int k=0;k<10;k++) {
			x1=r1.nextInt(20);
			System.out.print(x1+"\t");
		}
	}
}
