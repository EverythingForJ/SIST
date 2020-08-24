import java.io.IOException;
import java.net.Socket;

/*
 * java TcpChatClient 서버IP 대화명
*/
public class TcpChatClient {
	private Socket client;
	private TcpChatThread thread;
	
	public TcpChatClient(String serverIp, String uesrId) {
		try{
			this.client = new Socket(serverIp, 8888);
			this.thread = new TcpChatThread(uesrId);
			this.thread.start();
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		String serverIP = args[0];
		String userId = args[1]; // 대화명
		TcpChatClient chatClient = new TcpChatClient(serverIP, userId);
	}
}
