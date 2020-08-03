

public class Output {
	static void printLabel(){
		System.out.println("            << 쌍용 고등학교 성적관리프로그램>>");
		System.out.println("학번\t\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
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
