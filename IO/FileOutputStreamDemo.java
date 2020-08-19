import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
//		String path = "C:/temp/result.txt";
//		try(FileOutputStream fos = new FileOutputStream(path)){
//			fos.write("¾È³çÇÏ¼Ä¿ä? a".getBytes());
//			fos.write("\n".getBytes());
//			fos.write("Good Morning".getBytes());
//			System.out.println("Svae Success");
//		}catch(IOException e) {
//			
//		}
		
		String path = "C:/temp/result.txt";
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(path))){
			dos.writeBoolean(true);
			dos.write("\n".getBytes());
			dos.writeInt(8);
			dos.write("\n".getBytes());
			dos.writeDouble(89.6);
			dos.write("\n".getBytes());
			dos.writeUTF("¾È³çÇÏ¼¼¿ä");
			dos.write("\n".getBytes());
			dos.writeUTF("always");
			dos.write("\n".getBytes());
			System.out.println("Svae Success");
		}catch(IOException e) {
			
		}

		
	}
}
