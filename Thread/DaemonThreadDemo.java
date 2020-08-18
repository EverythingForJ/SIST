

public class DaemonThreadDemo implements Runnable{
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThreadDemo(),"Demo");
		t.setDaemon(true);
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//t.interrupt();
		System.out.println("Main Thread가 종료됐습니다.");
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("아직 Demon Thread가 실행중입니다.");
			try {
				Thread.sleep(500); //0.5
			}catch(InterruptedException ex) {
				break;
			}
		}
		System.out.println("여전히 Demon Thread가 작동중입니다.");
	}
}
