

class Student {
	private String name, idNum;
	private int kor, eng, mat, edp, tot;
	private double avg;
	private char grade;
	
	Student(String idNum, String name, int kor, int eng, int mat, int edp) {
		this.idNum = idNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}
	
	int getEdp() {
		return edp;
	}

	void setEdp(int edp) {
		this.edp = edp;
	}

	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getIdNum() {
		return idNum;
	}
	void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	int getKor() {
		return kor;
	}
	void setKor(int kor) {
		this.kor = kor;
	}
	int getEng() {
		return eng;
	}
	void setEng(int eng) {
		this.eng = eng;
	}
	int getMat() {
		return mat;
	}
	void setMat(int mat) {
		this.mat = mat;
	}
	int getTot() {
		return tot;
	}
	void setTot(int tot) {
		this.tot = tot;
	}
	double getAvg() {
		return avg;
	}
	void setAvg(double avg) {
		this.avg = avg;
	}
	char getGrade() {
		return grade;
	}
	void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%c",
				idNum, name, kor, eng, mat, edp, tot, avg, grade);
	}
}
