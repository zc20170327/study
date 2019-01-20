package arrayAccess;

public class ArrayAccess {
	private int[] array= {1,2,3,4,5};
	public void accessArray() {
		for(int i=0;i<=array.length;i++) {
			try {
				System.out.println(array[i]);
			} catch (Exception e) {
				System.out.println("数据下标越界异常");
			}
		}
	}
}
