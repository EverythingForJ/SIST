import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Input {
	private ArrayList<Student> list;
	private String data;
	
	Input(ArrayList<Student> list) {
		this.list = list;
		this.data = this.init();

	}
	
	void input() {
		StringTokenizer st = new StringTokenizer(this.data, "\n");
		int count = st.countTokens(); // 12
		while(st.hasMoreTokens()) {
			String line = st.nextToken().trim();
			Scanner scan = new Scanner(line).useDelimiter("\\s+");
			Student s = new Student(scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
			this.list.add(s);
		}
	}
	
	private String init() {
		String data = null;
		String path = "./data.dat";
		try(FileInputStream fis = new FileInputStream(path);) {
			byte[] buffer = new byte[1024];
			int count = fis.read(buffer);
			data = new String(buffer, 0, count);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} catch(IOException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return data;
	}
	
	
	
}