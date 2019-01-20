package chap14_1;



public class TicketsSystemTest {
	public static void main(String[] args) {
		
		TicketSystem st=new TicketSystem();
		
		new Thread(st).start();//线程一
		try	{
			Thread.sleep(1);
		} catch(Exception e)	{
			e.printStackTrace();
		}
		st.b=true;
		new Thread(st).start();//线程二	
		
	}
}
