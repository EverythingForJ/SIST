

public class YieldDemo implements Runnable{
	public static void main(String[] args) {
		YieldDemo yd1 = new YieldDemo();
		Thread t1 = new Thread(yd1,"Sally");
		YieldDemo yd2 = new YieldDemo();
		Thread t2 = new Thread(yd2,"Duncan");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "-->" + i);
			}catch(InterruptedException ex) {}
		}
	}
}

