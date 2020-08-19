import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) {
		//System.out.println("A");
		OutputStream os = System.out;
		
		String str = "안녕, 세계";
		
		try {
			//os.write(65);

			byte[] buffer = str.getBytes(); // 문자열을 바이트배열로 바꿔주는
			os.write(buffer);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte [] buffer = str.getBytes();
		for(byte b : buffer) System.out.println(b);
	}
}
