import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		// C:\temp\result.dat - 오직 ms windows에서만
		// /home/instructoe/temp
		// System.out.println(System.getProperty("file.separator"));
		// System.out.println(File.separator);
		// -cp .; C:/temp - 오직 ms windows에서만
		// -cp .: /home/
		// System.out.println(System.getProperty("path.separator"));
		// System.out.println(File.pathSeparator);
		File file = new File("../../JavaHome/0820/src/FileDmo.java");
		System.out.println("getName() = " + file.getName());
		System.out.println("getPath() = "+file.getPath());
		System.out.println("getParent() = "+file.getParent());
		System.out.println("getAbsolutePath() = "+file.getAbsolutePath());
		try {
			System.out.println("getCanonicalPath() = "+file.getCanonicalPath()); // 절대 경로
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}