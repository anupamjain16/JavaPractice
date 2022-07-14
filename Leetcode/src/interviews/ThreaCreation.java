package interviews;

public class ThreaCreation extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			// the thread will sleep for the 500 milli seconds
			try {
				Thread.sleep(50);
				
				
				ThreaCreation x1 = new ThreaCreation();
				x1.run2();
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}

	}
	
	
	public void run2() {
		for (int i = 6; i < 10; i++) {
			// the thread will sleep for the 500 milli seconds
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}

	}
	
	
	
	
}


