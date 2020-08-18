/*
 * 강제로, 안전하게 쓰레드를 중단하는 방법
 * (stop()은 사용 불가)
 * 1. 멤버 변수 boolean형 flag를 사용하기 --> main에서 stop해도 바로 stop한다는 보장이 없다.
 * 2. Exception을 이용하는 방법
*/


//1. 멤버 변수 boolean형 flag를 사용하기 --> main에서 stop해도 바로 stop한다는 보장이 없다. Thread 중지 시차가 있다.
public class StopThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		System.out.println("방금 Thread를 start했습니다.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {}
			System.out.println("지금 main이 Thread를 stop하겠습니다.");
			mt.stop();
	}
}

class MyThread implements Runnable{
	private boolean isStop = false;
	
	void stop() {
		this.isStop = true;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1); // 0.001
			}catch(InterruptedException ex) {}
				System.out.println("I'm alive");
			if(this.isStop) break;
		}
		System.out.println("I'm dead..");
	}
	
}