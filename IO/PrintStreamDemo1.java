import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class PrintStreamDemo1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("저장 경로 : ");
		String path = scan.next();
		path += String.format("%tF", new Date())+".txt";
		
		try(PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(path)),true)){
			String line = null;
			int count = 0;
					
			while((line = scan.nextLine()) !=null ) {
				ps.printf("%3d:%s%n", ++count, line);
			}
			System.out.println("Svae success");
		}catch(IOException e) {
				System.out.println(e);
		}
		
	}
}
