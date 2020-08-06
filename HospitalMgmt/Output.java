public class Output {
	private Patient [] array;
	private int count;

	public Output(Patient [] array, int count){
		this.array = array;
		this.count = count;
	}
	
	public void output(){
		this.printTitle();
		this.printDash();
		this.printLabel();
		this.printDash();
		for(int i = 0 ; i < this.count ; i++){
			System.out.printf("%2d\t%s\t%,8d\t%,10d\t%,10d\n",
					this.array[i].getNo(), this.array[i].getDepartment(),
					this.array[i].getCheckFee(), this.array[i].getAdmissionFee(), 
					this.array[i].getTotalFee());
		}
		this.printDash();
	}
	private void printDash(){
		for(int i = 0 ; i < 60 ; i++){
			System.out.print("-");
		}
		System.out.println();
	}
	private void printTitle(){
		System.out.println("                          <<�����������α׷�>>");
	}
	private void printLabel(){
		System.out.println("��ȣ\t�����μ�\t    ������\t\t�Կ���\t\t�����");
	}
}