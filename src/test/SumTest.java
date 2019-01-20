package test;

public class SumTest {

	public static void main(String[] args) {
		int[] a= {1,2,3,5,6,7};
		System.out.println("1，2，3的和是"+getSum(1,2,3));
		System.out.println("1，2，3,4的和是"+getSum(1,2,3,4));
		System.out.println("数组的和是"+getSum(a));
		
	}
	public  static int getSum(int ... x) {
		int sum=0;
		for(int i:x) {
			sum+=i;
		}
		return  sum;
	}
}
