import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) {
		//System.out.println("A");
		OutputStream os = System.out;
		
		String str = "�ȳ�, ����";
		
		try {
			//os.write(65);

			byte[] buffer = str.getBytes(); // ���ڿ��� ����Ʈ�迭�� �ٲ��ִ�
			os.write(buffer);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte [] buffer = str.getBytes();
		for(byte b : buffer) System.out.println(b);
	}
}
