

public class InstanceofDemo {

	public static void main(String[] args) {
		Mammal m = new Mammal();//부모형
		Korean ko = new Korean();//자식형
		// 한국인은 포유류이다. -> Korean is a Mammal.
		// m=ko; // 자식이 부모형으로 변환하는 것은 무조건 성공한다.
		// 포유류는 한국인이다???? X
		// ko = (Korean)m; //자동형변환에러, 강제형변환 컴파일 에러
		Object obj = new Object();
		String str = new String();
		//obj = str; // 만약 전에 형변환이 한번되었었다면 밑에 라인 에러없이 실행가능
		//str = (String)obj;
		if(obj instanceof String) System.out.println("형변환 가능");
		else System.out.println("형변환 불가능");
	}

}
