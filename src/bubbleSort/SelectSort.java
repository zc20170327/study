package bubbleSort;

public class SelectSort {
	public  void  selectSort() {
		int[] a= {9,12,45,23,14,51,34,24,89};
		System.out.println("排序前:");
		for(int n:a) {
			System.out.print(n+"\t");
		}
		System.out.println();
		for (int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
			 if(a[index]>a[j]) {
				 index=j;
			 }
			}
			 if(index!=i) {
				 int temp=0;
				 temp=a[index];
				 a[index]=a[i];
				 a[i]=temp;
			 }
		}
		System.out.println("排序后:");
		for(int n:a) {
			System.out.print(n+"\t");
		}
	}
}
