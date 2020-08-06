import java.util.Scanner;

public class TestStudent {
	private Scanner scan;
	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		System.out.println("<<학사 프로그램 시작>>");
		ts.scan = new Scanner(System.in);
		int choice = ts.showMenu();
		ts.branch(choice);
		System.out.println("<<학사 프로그램 종료>>");
	}

	void branch(int choice){
		switch(choice) {
			case 1: gotoUnderGraduate(); break;
			case 2: gotoGraduate(); break;
			default:
				System.out.println("잘못된 값입니다.");
				System.exit(-1); //프로그램 강제종료
		}
	}
	
	void gotoStudent() {
		System.out.println("이름 : "); String name = this.scan.next();
		System.out.println("학번 : "); String idNum = this.scan.next();
		System.out.println("소속 학과 : "); String major = this.scan.next();
		System.out.println("학년 : "); int grade = this.scan.nextInt();
		System.out.println("이수 학점 수 : "); int score = this.scan.nextInt();
	}
	
	void gotoGraduate() {
		System.out.println("[반갑습니다. 대학원생]");
		System.out.println("이름 : "); String name = this.scan.next();
		System.out.println("학번 : "); String idNum = this.scan.next();
		System.out.println("소속 학과 : "); String major = this.scan.next();
		System.out.println("학년 : "); int grade = this.scan.nextInt();
		System.out.println("이수 학점 수 : "); int score = this.scan.nextInt();
		System.out.println("조교 유형 : "); String assistantType = this.scan.next();
		System.out.println("장학금 비율 : "); double ratio = this.scan.nextDouble();
		Graduate gra = new Graduate(name, idNum, major, grade, score, assistantType, ratio);
		System.out.println(gra);
	}
	
	void gotoUnderGraduate() {
		System.out.println("[반갑습니다. 학부생]");
		System.out.println("이름 : "); String name = this.scan.next();
		System.out.println("학번 : "); String idNum = this.scan.next();
		System.out.println("소속 학과 : "); String major = this.scan.next();
		System.out.println("학년 : "); int grade = this.scan.nextInt();
		System.out.println("이수 학점 수 : "); int score = this.scan.nextInt();
		System.out.println("소속 동아리 이름 : "); String clubName = this.scan.next();
		UnderGraduate gra = new UnderGraduate(name, idNum, major, grade, score, clubName);
		System.out.println(gra);
	}
	
	int showMenu() {
		scan = new Scanner(System.in);
		System.out.println("<<Menu>>");
		System.out.println("1. UnderGraduate");
		System.out.println("2. Graduate");
		System.out.println("Who are you (1/2)? : ");
		int choice = this.scan.nextInt();
		return choice;
	}
	

}

class Student {
	private String name, idNum, major;
	private int grade, score;
	
	public Student(String name, String idNum, String major, int grade, int score) {
		super();
		this.name = name;
		this.idNum = idNum;
		this.major = major;
		this.grade = grade;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%d\t", name, idNum, major, grade, score);
	}
	
	
}

class UnderGraduate extends Student{
	private String clubName;

	public UnderGraduate(String name, String idNum, String major, int grade, int score, String clubName) {
		super(name, idNum, major, grade, score);
		this.clubName = clubName;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%s%n", this.clubName);
	}
	
}

class Graduate extends Student{
	private String assistantType;
	private double ratio;
	
	public Graduate(String name, String idNum, String major, int grade, int score, String assistantType,
			double Ratio) {
		super(name, idNum, major, grade, score);
		this.assistantType = assistantType;
		this.ratio = ratio;
	}
	
	public String getAssistantType() {
		return assistantType;
	}
	public void setAssistantType(String assistantType) {
		this.assistantType = assistantType;
	}
	public double getAssistantRatio() {
		return ratio;
	}
	public void setAssistantRatio(double assistantRatio) {
		this.ratio = ratio;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%s\t%.1f%n", this.assistantType, this.ratio);
	}
	
}