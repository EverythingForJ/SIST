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
		this.raf.write(("            << �ֿ� ����б� �����������α׷�>>\n").getBytes("KSC5601"));
		this.raf.write("�й�\t�̸�\t����\t����\t����\t����\t����\t���\t����\n".getBytes("KSC5601"));
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
