package multi;

public class MultiTable {
	/**
	 * 打印9*9乘法表
	 */
	public  void printing() {
		int i=1;//行
		while(true) {
			int j=1;//列
			while(true) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
				if(j>i) {
					break;
				}		
			}
			System.out.println();
			i++;
			if(i>9) {
				break;
			}
		}
	}
}
