

public class TwoThread extends Thread{
	public static void main(String[] args) { // main 쓰레드가 main method를 돌린다.
		TwoThread tt = new TwoThread();
		//tt.run();
		tt.start();
		for(int i=0; i<10; i++) { // main Thread가 돌린다.
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
		
	}
	
	@Override
	public void run() { // Thread0이 돌린다.
		for(int i=0; i<10; i++) System.out.println(Thread.currentThread().getName()+"-->"+i);
	}
}
