// enum�� �̸� �����Ǿ��ִ� ���� ����ϱ����ؼ� ����Ѵ�.

public class EnumDemo {
	public static void main(String[] args) {
//		Week week = Week.WED;
//		int su = week.ordinal(); // ���°�� �ִ°�
//		System.out.println(su);
		
		Week[] array = Week.values();
		for(Week w : array) {
			System.out.print(w); // �̸�
			System.out.print(", " + w.getValue()); // ��
			System.out.println(", "+w.ordinal()); // ��ġ
		}
	}
}
