import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

class OutputRAF {
	private ArrayList<Student> list;
	private RandomAccessFile raf;
	
	OutputRAF(ArrayList<Student> list) {
		this.list = list;
		String path = "./result1.dat";
		try {
			raf = new RandomAccessFile(path, "rw");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	private void printLabel() throws IOException{
		this.raf.write(("            << 쌍용 고등학교 성적관리프로그램>>\n").getBytes("KSC5601"));
		this.raf.write("학번\t이름\t국어\t영어\t수학\t전산\t총점\t평균\t평점\n".getBytes("KSC5601"));
		this.raf.write("-------------------------------------------------------------\n".getBytes("KSC5601"));
	}
	
	void output(){
		try {
			this.printLabel();
			for(Student s : this.list) this.raf.write(s.toString().getBytes("KSC5601"));
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Save success.");
		//this.raf.close();
	}
}
