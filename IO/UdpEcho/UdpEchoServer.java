import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpEchoServer {
	private DatagramSocket server;
	private DatagramPacket sendPacket, receivePacket;
	
	public UdpEchoServer() {
		try{
			this.server = new DatagramSocket(9999); // 소켓을 만들고 레디
			System.out.println("Server is ready.");
		}catch(SocketException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		try {
			while(true) {
				byte[] buffer = new byte[512]; // 메세지 받을 바이트배열 생성
				this.receivePacket = new DatagramPacket(buffer, buffer.length); // 패킷을 만든다.
				this.server.receive(receivePacket); // 패킷을 받았다.
				String message = new String(buffer, 0, receivePacket.getLength()); // 메세지를 바이트배열에서 스트링으로 바꾼다.
				if(message.equals("/quit")) break; // 끝내고 싶을 때
				InetAddress clientAddress = this.receivePacket.getAddress(); // 받았으니 다시 보낼 주소 알아내기
				int clientPort = this.receivePacket.getPort(); // 다시 보낼 포트 알아내기
				System.out.println("["+clientAddress.getHostAddress()+"]"+message);
				byte[] sendBuffer = ("From Server : "+ message).getBytes(); // 스트링 다시 바이트배열로
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort); // 보낸다.
				this.server.send(sendPacket); // 보냈다.
			}
		}catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new UdpEchoServer().service();
	}
}
