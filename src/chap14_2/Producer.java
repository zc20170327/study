package chap14_2;

public class Producer extends  Thread{
	Queue q;
	Producer (Queue q){
		this.q=q;
	}
	public  void run() {
		for(int i =0;i<10;i++) {
			q.put(i);
			System.out.println("produce put "+i);
		}
	}
	
}
