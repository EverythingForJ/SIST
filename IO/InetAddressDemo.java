import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a host name : ");
		String hostName = scan.next(); // hostName�� �߰��� ������ ������ �ȵȴ�.
		try {
//			InetAddress ia = InetAddress.getByName(hostName);
//			System.out.println(hostName + "-> "+ ia.getHostAddress());
			InetAddress [] array = InetAddress.getAllByName(hostName);
			for(InetAddress ia : array ) System.out.println(hostName + "-> "+ ia.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}