import java.util.Scanner;

public class Input {

	static void input(Student[] array){
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int i=0; i<array.length; i++) {
			array[i] = new Student();
			System.out.println((i+1)+"��° �л� �Է� >> ");
			System.out.print("�й� : ");
			String idNum = scan.next();
			System.out.print("�̸� : ");
			String name = scan.next();
			System.out.print("���� : ");
			int kor = scan.nextInt();
			System.out.print("���� : ");
			int eng = scan.nextInt();
			System.out.print("���� : ");
			int mat = scan.nextInt();
			array[i].setIdNum(idNum);
			array[i].setName(name);
			array[i].setKor(kor);
			array[i].setEng(eng);
			array[i].setMat(mat);
		}
	}
}