package t1_create_thread;

public class PrintTask implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("PrintTask 띵!!!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}// end for
		System.out.println("PrintTask 종료");
	}// end run method
	
}// end PrintTask class
