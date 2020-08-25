import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static long startTime, endTime;
	
	
	public static void main(String[] args) throws IOException{
		File file = new File("C:/temp/sqldeveloper.zip");
		InputStream is = new FileInputStream(file);
		byte[] buffer = new byte[is.available()];
		startTime = System.currentTimeMillis();
		is.read(buffer);
		OutputStream out = new FileOutputStream(new File("available.zip"));
		out.write(buffer);
		endTime = System.currentTimeMillis();
		System.out.println("복사 시간 : "+(endTime - startTime)+"ms");
	}
}
