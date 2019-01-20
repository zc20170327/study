package test;

import scoreArray.ScoreArray;

public class ScoreArrayTest {

	public static void main(String[] args) {
		ScoreArray array=new ScoreArray(40);
		System.out.println("原始数据数组如下:");
		array.printAarry(array.getScore());
		array.modifyArray(array.getScore());
		System.out.println("补考后修改成绩数组如下:");
		array.printAarry(array.getScore());
	}

}
