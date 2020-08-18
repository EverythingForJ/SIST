/*
 * Thread 생성 방법 2가지
 * 1. Thread extends
 * 2. Runnable implements
 * 
 * 둘 다 run method 를 재정의해야 한다.
 * 
 * 
*/
public class CreateThread1 implements Runnable{ // Runnable은 Thread를 통해서 사용해야한다.
		
	public static void main(String[] args) {
		CreateThread1 ct1 = new CreateThread1();
		CreateThread1 ct2 = new CreateThread1();
		Thread t1 = new Thread(ct1, "Sally");
		Thread t2 = new Thread(ct2, "Duncan");
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) System.out.println(Thread.currentThread().getName()+"-->"+i);
	}
	
}
