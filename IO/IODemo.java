import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
//		System.out.print("한 개의 글자를 입력해주세요 : ");
//		InputStream is = new InputStream();
		System.out.print("어느 계절 좋아함? : ");
		
		InputStream is = System.in; // 키보드로부터 읽어들이는 표준 입력 스트림ㅁ
		String season ="";
		try {
			while(true) {
				int su = is.read(); // ASCII를 읽는다
				if(su<0||(char)su == '\n')break;
				else season += (char)su;
			}
			System.out.println("season = "+season);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
