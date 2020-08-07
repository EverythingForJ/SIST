// Conversion / Cast
// 1. Primitive Type
//		1)자동형변환(암시적형변환, implicit conversion, 작은쪽에서 큰쪽으로, promotion)
//			4+89.5 ==> double, 숫자 + 문자 ==> 문자
//		2)강제형변환(명시적형변환, explicit conversion, 큰쪽에서 작은쪽으로 변환, demotion)
//			(int)89.5 ==> 89
//	2. Reference Type
//		1)자동형변환(암시적형변환, implicit conversion, promotion, 자식쪽에서 부모쪽으로 변환, cast up)
//		2)강제형변환(명시적형변환, explicit conversion, demotion, 부모쪽에서 자식쪽으로 변환, downward cast)

public class ObjectConversion {

	public static void main(String[] args) {
//		Test test = new Test();
//		Demo demo = new Demo();
//		//test = demo; // 자동 형변환 // 자식이 부모로 자동,강제 형변환 가능.
//		if(test instanceof Demo) // instanceof 연산자를 사용하여 형변환이 가능한지 불가능한지 물어봐야한다. 되는 경우 true return
//		demo = (Demo)test; // 부모가 자식으로 강제형변환은 될때가 있고 안될 때가 있다.
//		else System.out.println("No");
		
		Object obj; // 부모형 선언
		obj = new String(); // 자식 생성, obj = str
		double avg = 4;
	}

}
class Test{
	
}
class Demo extends Test{
	
}