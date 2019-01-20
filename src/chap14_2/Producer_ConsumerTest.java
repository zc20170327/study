package chap14_2;

public class Producer_ConsumerTest {

	public static void main(String[] args) {
		Queue q=new Queue();
		Producer producer=new Producer(q);
		Consumer consumer=new Consumer(q);
		producer.start();
		consumer.start();
	}

}
