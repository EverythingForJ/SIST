import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) {
		try(RandomAccessFile raf = new RandomAccessFile("C:/temp/raf.txt", "rw")){
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.writeBoolean(true);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.write("\n".getBytes());
			raf.writeInt(24);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.write("\n".getBytes());
			raf.writeDouble(89.5);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.write("\n".getBytes());
			raf.writeUTF("안녕하셍");
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.write("\n".getBytes());
			raf.writeUTF("Hello,");
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			System.out.println("File saved successfully");
			raf.seek((long)0); // 포인터 제일 앞으로 이동
			System.out.printf("%b%n", raf.readBoolean());
			raf.readLine(); // 한줄씩 읽는다.
			System.out.printf("%d%n", raf.readInt());
			raf.readLine();
			System.out.printf("%.1f%n", raf.readDouble());
			raf.readLine();
			System.out.printf("%s%n", raf.readUTF());
			raf.readLine();
			System.out.printf("%s%n", raf.readUTF());
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
