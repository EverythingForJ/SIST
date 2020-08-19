import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		try(PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("C:/temp/result.dat")),true)) {
			ps.printf("%-10s%10s%10d%10.1f%10c%n", "2020-001", "한지민", 363, 90.1234, 'A');
			ps.printf("%s", "Hello, World");
			System.out.println("잘 저장되었습니다.");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
