/*
 * ������, �����ϰ� �����带 �ߴ��ϴ� ���
 * (stop()�� ��� �Ұ�)
 * 1. ��� ���� boolean�� flag�� ����ϱ� --> main���� stop�ص� �ٷ� stop�Ѵٴ� ������ ����.
 * 2. Exception�� �̿��ϴ� ���
*/

// 2. Exception�� �̿��ϴ� ��� ->  Thread ���� ������ ����.
public class StopThread1 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(mt);
		t.start();
		System.out.println("��� Thread�� start�߽��ϴ�.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {}
			System.out.println("���� main�� Thread�� stop�ϰڽ��ϴ�.");
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