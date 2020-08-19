import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Vector;

class Output {
	private Vector<Patient> vector;
	private PrintStream ps;
	
	Output(Vector<Patient> vector)throws IOException{
		this.vector = vector;
		String path ="./result.dat";
		this.ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(path)), true);
	}
	
	void output(){
		this.printTitle();
		this.printDash();
		this.printLabel();
		this.printDash();
		for(int i = 0 ; i < this.vector.size() ; i++){
			this.ps.printf("%2d\t%s\t%,8d\t%,10d\t%,10d\n",
					this.vector.get(i).getNo(), this.vector.get(i).getDepartment(),
					this.vector.get(i).getCheckFee(), this.vector.get(i).getAdmissionFee(), 
					this.vector.get(i).getTotalFee());
		}
		
		this.printDash();
		System.out.println("���� ����");
	}
	private void printDash(){
		for(int i = 0 ; i < 60 ; i++){
			this.ps.print("-");
		}
		this.ps.println();
	}
	private void printTitle(){
		this.ps.println("                          <<�����������α׷�>>");
	}
	private void printLabel(){
		this.ps.println("��ȣ\t�����μ�\t    ������\t\t�Կ���\t\t�����");
	}
}