package chap14_2;

public class Queue {
	int value;
	boolean bFull=false;
	public synchronized void  put(int i )
	{
		if (!bFull) {
			value=i;
			bFull=true;
			notify();
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  synchronized int get() {
		if(!bFull) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		bFull=false;
		notify();
		return  value;
	}
}
