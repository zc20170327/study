package addWhile;

public class AddWhile {
	public void add() {
		int  sum=0;
		int i=1;
		while(i<100) {
			sum=sum+i;
			i++;
		}
		System.out.println("1+2+3+4+....+1000的和sum="+sum);
	}
}
