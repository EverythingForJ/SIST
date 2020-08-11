// enum은 미리 지정되어있는 값만 사용하기위해서 사용한다.

public class EnumDemo {
	public static void main(String[] args) {
//		Week week = Week.WED;
//		int su = week.ordinal(); // 몇번째에 있는가
//		System.out.println(su);
		
		Week[] array = Week.values();
		for(Week w : array) {
			System.out.print(w); // 이름
			System.out.print(", " + w.getValue()); // 값
			System.out.println(", "+w.ordinal()); // 위치
		}
	}
}
