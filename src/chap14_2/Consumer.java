package chap14_2;

public class Consumer extends  Thread{
	Queue q;
	Consumer(Queue q){
		this.q=q;
	}
	public  void  run() {
		while(true) {
			System.out.println("Consumer get"+q.get());
		}
	}
}
