

public class Output {
	static void printLabel(){
		System.out.println("            << �ֿ� ����б� �����������α׷�>>");
		System.out.println("�й�\t\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("-------------------------------------------------------------");
	}
	static void output(Student[] array ){
		printLabel();
		for(int i=0; i<array.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", 
					array[i].getIdNum(), array[i].getName(), array[i].getKor(), array[i].getEng(), array[i].getMat(), array[i].getTot(), array[i].getAvg(), array[i].getGrade());
		}
	}
}
