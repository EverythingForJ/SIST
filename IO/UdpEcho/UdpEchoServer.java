import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpEchoServer {
	private DatagramSocket server;
	private DatagramPacket sendPacket, receivePacket;
	
	public UdpEchoServer() {
		try{
			this.server = new DatagramSocket(9999); // ������ ����� ����
			System.out.println("Server is ready.");
		}catch(SocketException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		try {
			while(true) {
				byte[] buffer = new byte[512]; // �޼��� ���� ����Ʈ�迭 ����
				this.receivePacket = new DatagramPacket(buffer, buffer.length); // ��Ŷ�� �����.
				this.server.receive(receivePacket); // ��Ŷ�� �޾Ҵ�.
				String message = new String(buffer, 0, receivePacket.getLength()); // �޼����� ����Ʈ�迭���� ��Ʈ������ �ٲ۴�.
				if(message.equals("/quit")) break; // ������ ���� ��
				InetAddress clientAddress = this.receivePacket.getAddress(); // �޾����� �ٽ� ���� �ּ� �˾Ƴ���
				int clientPort = this.receivePacket.getPort(); // �ٽ� ���� ��Ʈ �˾Ƴ���
				System.out.println("["+clientAddress.getHostAddress()+"]"+message);
				byte[] sendBuffer = ("From Server : "+ message).getBytes(); // ��Ʈ�� �ٽ� ����Ʈ�迭��
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort); // ������.
				this.server.send(sendPacket); // ���´�.
			}
		}catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new UdpEchoServer().service();
	}
}
