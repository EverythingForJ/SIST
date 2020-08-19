import java.io.IOException;
import java.io.RandomAccessFile;

// �ѱ� Ȯ��
public class RandomAccessFileDemo {
	public static void main(String[] args) {
		String path = "./src/RandomAccessFileDemo.java";
		try(RandomAccessFile raf = new RandomAccessFile(path, "r")){
			while(raf.getFilePointer() < raf.length()) {
				String line = raf.readLine();
				line = CharConversion.enToKo(line);
				System.out.println(line);
				
//				System.out.println(raf.readLine());
				
//				System.out.print((char)raf.read());
//				System.out.println("�������� ���� ��ġ : " + raf.getFilePointer());
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}