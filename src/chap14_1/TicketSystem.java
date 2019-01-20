package chap14_1;

public class TicketSystem implements Runnable{
int tickets=100;
Object obj=new Object();
boolean b=false;
public void run() {
	if(b==false) {
		while(true)
			sell();
	} else 	{
		while(true) {
			synchronized(obj) {//同步对象
				try {
					Thread.sleep(10);
				} catch(Exception e) {
					e.printStackTrace();
				}
				//synchronized(this) {
					if(tickets>0){							
						System.out.println("obj:"+Thread.currentThread().getName()+
								" sell tickets:"+tickets);
						tickets--;
					}
				//}
			}
		}
	}
}
public synchronized void sell() {//同步方法
	synchronized(obj) {
		if(tickets>0) {
			try {
				Thread.sleep(10);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("sell():"+Thread.currentThread().getName()+" sell tickets:"+tickets);
			tickets--;
		}
	}
}}
