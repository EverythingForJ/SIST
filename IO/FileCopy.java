import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� : ");
		String originalPath = scan.next().trim();
		System.out.println("���� ���� : ");
		String targetPath = scan.next().trim();
		int count = 0, su;
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalPath)); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetPath))){
			byte[] buffer = new byte[512]; 
			while((su = bis.read(buffer))>=0) {
				 count+= su;
				 bos.write(buffer,0,count);
			 }
			 System.out.println((count/1000)+"KB file copied successfully.");
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
