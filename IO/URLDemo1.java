import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a URL : ");
		String urlStr = scan.next();
		URL url = null;
		BufferedReader br = null;
		String line = null;
		try {
			url = new URL(urlStr);
			String hostName = url.getHost();
			int last = hostName.lastIndexOf(".");
			int start = 0;
			if(hostName.startsWith("www")) start = hostName.indexOf(".") + 1;
			
			// System.out.println(hostName.lastIndexOf("."));
			String file = hostName.substring(start, last)+ ".html";
			InputStream is = url.openStream();
			PrintWriter pw = null;
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(file))));
			while((line = br.readLine()) != null) {
//				System.out.println(line);
				pw.printf("%s%n",line);
				pw.flush();
			}
			br.close();
			pw.close();
			System.out.println("Svae Success");
		}catch(MalformedURLException e){
			System.out.println("잘못된 URL입니다.");
		}catch(IOException e) {
			
		}
	}
}
