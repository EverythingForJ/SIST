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
			this.client = new DatagramSocket(); // client�� ������ ��Ʈ��ȣ ����. => ������ ��Ʈ�� �������� ����ϰڴٴ� ��
			this.scan = new Scanner(System.in);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		try{
			System.out.println("server���� ���� �޼����� �Է��ϼ���. �׸��Ͻ÷��� /quit�� ��������.");
			while(true) {
				System.out.print(">>");
				String message = this.scan.nextLine();
				byte[] sendBuffer = message.getBytes();
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName("localhost"), 9999); // ������.
				this.client.send(sendPacket); // ���´�.
				
				if(message.equals("/quit")) break; // ��ġ �߿�
				
				byte[] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length); // �޴´�
				this.client.receive(receivePacket); // �޾Ҵ�.
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
