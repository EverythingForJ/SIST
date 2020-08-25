import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpEchoClient {
	private DatagramSocket client;
	private DatagramPacket sendPacket, receivePacket;
	private Scanner scan;
	
	public UdpEchoClient() {
		try {
			this.client = new DatagramSocket(); // client용 소켓은 포트번호 없음. => 가용한 포트를 랜덤으로 사용하겠다는 뜻
			this.scan = new Scanner(System.in);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		try{
			System.out.println("server에게 보낼 메세지를 입력하세요. 그만하시려면 /quit를 넣으세요.");
			while(true) {
				System.out.print(">>");
				String message = this.scan.nextLine();
				byte[] sendBuffer = message.getBytes();
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName("localhost"), 9999); // 보낸다.
				this.client.send(sendPacket); // 보냈다.
				
				if(message.equals("/quit")) break; // 위치 중요
				
				byte[] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length); // 받는다
				this.client.receive(receivePacket); // 받았다.
				System.out.println(new String(buffer, 0, this.receivePacket.getLength()));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		new UdpEchoClient().service();
	}
}
