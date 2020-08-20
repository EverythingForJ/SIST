import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

class Output {
	private ArrayList<Student> list;
	private PrintStream ps;
	
	Output(ArrayList<Student> list) {
		this.list = list;
		String path = "./result.dat";
		try {
			ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(path)), true);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	private void printLabel(){
		this.ps.println("            << 쌍용 고등학교 성적관리프로그램>>");
		this.ps.println("학번\t이름\t국어\t영어\t수학\t전산\t총점\t평균\t평점");
		this.ps.println("-------------------------------------------------------------");
	}
	
	void output(){
		this.printLabel();
		for(Student s : this.list) this.ps.println(s);
		System.out.println("Save success.");
		this.ps.close();
	}
}
