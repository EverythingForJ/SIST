

public class ExceptionDemo2 {
	public static void main(String[] args) {
//		Student chulsu = new Student(80);
//		System.out.println(chulsu);
		
		//"5" --> 5
//		int su = Integer.parseInt("hello");
//		System.out.printf("su = %d",su);
		
		
	}
}

class Student{
	private int kor;
	
	public Student(int kor) throws RuntimeException { // runtime예외는 언체크라 try catch를 안서도 되지만 다른 예외의 경우 반드시 try catch를 써야한다.
		if(kor<0||kor>100) throw new RuntimeException("국어 점수의 범위가 잘못되었습니다.\n확인 후 다시 입력해주세요.");
		else this.kor = kor;
	}

	@Override
	public String toString() {
		return String.format("국어점수 = %d", this.kor);
	}
	
	
}

