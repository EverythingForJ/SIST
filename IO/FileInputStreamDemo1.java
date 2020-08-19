import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
	public static void main(String[] args) {
		String path = "./src/FileInputStreamDemo.java";
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(path))) {
			byte[] buffer = new byte[1024];
			int count = 0;
			while((count = bis.read(buffer))>=0) {
				System.out.println(new String(buffer, 0, count));
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
