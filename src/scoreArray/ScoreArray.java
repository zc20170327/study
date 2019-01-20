package scoreArray;

import java.net.Socket;
import java.util.Random;

public class ScoreArray {
	private int[] score;
	private Random random;
	public ScoreArray(int num) {
		score=new int[num];
		random=new Random();
		for(int i=0;i<score.length;i++) {
			score[i]=random.nextInt(100);
		}
	}
	public ScoreArray(int[] arr) {
		score=new int[arr.length];
		score=arr;
	}
	public  void printAarry(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i%8==0) {
				System.out.println();
			}
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	public  void modifyArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<60) {
				a[i]=60;
			}
		}
	
	}
	public  int[] getScore() {
		return score;
	}
}
