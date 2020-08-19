import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * InputStream --> Reader --> Memory --> Writer --> OutputStream
*/

public class BridgeClassDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("����� ��� ������ �����Ͻʴϱ�? : ");
		InputStream is = System.in; // ǥ�� �Է�(from keyboard)
		InputStreamReader isr = new InputStreamReader(is);
		// System.out.println(isr.getEncoding());
		BufferedReader br = new BufferedReader(isr);
		String season = br.readLine();
		System.out.println("season = "+season);
		
	}
}
