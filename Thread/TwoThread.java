

public class TwoThread extends Thread{
	public static void main(String[] args) { // main �����尡 main method�� ������.
		TwoThread tt = new TwoThread();
		//tt.run();
		tt.start();
		for(int i=0; i<10; i++) { // main Thread�� ������.
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
		
	}
	
	@Override
	public void run() { // Thread0�� ������.
		for(int i=0; i<10; i++) System.out.println(Thread.currentThread().getName()+"-->"+i);
	}
}
