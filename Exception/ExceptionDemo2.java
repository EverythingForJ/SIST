

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
	
	public Student(int kor) throws RuntimeException { // runtime���ܴ� ��üũ�� try catch�� �ȼ��� ������ �ٸ� ������ ��� �ݵ�� try catch�� ����Ѵ�.
		if(kor<0||kor>100) throw new RuntimeException("���� ������ ������ �߸��Ǿ����ϴ�.\nȮ�� �� �ٽ� �Է����ּ���.");
		else this.kor = kor;
	}

	@Override
	public String toString() {
		return String.format("�������� = %d", this.kor);
	}
	
	
}

