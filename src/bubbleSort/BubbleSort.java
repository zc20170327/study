package bubbleSort;

public class BubbleSort {
	/**
	 * 冒泡排序1
	 */
	public void sort() {
		int[] array= {3,2,1,5,4,7};
		System.out.println("排序前的数组为:");
		for(int n:array) {
			System.out.print(n+"\t");
		}
		System.out.println();
		int temp=0;
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("排序后的数据为:");
		for(int n:array) {
			System.out.print(n+"\t");
		}
		
	}
	public  void  sort2() {
		int[] array= {3,2,1,5,4,7};
		System.out.println("排序前的数组为:");
		for(int n:array) {
			System.out.print(n+"\t");
		}
		System.out.println();
		int temp=0;
		for(int i=array.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println("排序后的数据为:");
		for(int n:array) {
			System.out.print(n+"\t");
		}
		
	
	}
}
