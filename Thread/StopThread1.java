/*
 * 강제로, 안전하게 쓰레드를 중단하는 방법
 * (stop()은 사용 불가)
 * 1. 멤버 변수 boolean형 flag를 사용하기 --> main에서 stop해도 바로 stop한다는 보장이 없다.
 * 2. Exception을 이용하는 방법
*/

// 2. Exception을 이용하는 방법 ->  Thread 중지 시차가 없다.
public class StopThread1 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(mt);
		t.start();
		System.out.println("방금 Thread를 start했습니다.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {}
			System.out.println("지금 main이 Thread를 stop하겠습니다.");
			// mt.stop();
			t.interrupt();
	}
}

class MyThread1 implements Runnable{
		
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1);
				System.out.println("I'm alive");
			}
//			while(Thread.currentThread().isInterrupted()) {
//				Thread.sleep(1);
//				System.out.println("I'm alive");
//			}
		}catch(InterruptedException ex) {
			System.out.println("I'm dead..");
		}
	}
	
}