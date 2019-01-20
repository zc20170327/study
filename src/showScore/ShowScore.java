package showScore;

import java.util.Random;

public class ShowScore {
	private int m=0,n=0;
	private int a[][];
	public  ShowScore(int m,int n) {
		this.m=m;
		this.n=n;
		a=new int[m][n];
	}
	public  void inital() {
		Random ram=new Random(1);
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=ram.nextInt(101);
			}
		}
	}
	public  void  show() {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[j].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	/**
	 * 学生平均成绩
	 */
	public void stuAverage() {
		int sum;
		for(int i=0;i<a.length;i++) {
			sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
			System.out.println("第"+(i+1)+"位同学的平时成绩是"+sum/a[i].length);
		}
	}
	/**
	 * 课程平均成绩
	 */
	public  void CourseAverage() {
		int sum;
		for (int  j=0;j<n;j++) {
			sum=0;
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i][j];
			}
			System.out.println("第"+(j+1)+"门课的平均成绩是"+sum/(a.length));
		}
	}
}
