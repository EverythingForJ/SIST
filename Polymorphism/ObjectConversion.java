// Conversion / Cast
// 1. Primitive Type
//		1)�ڵ�����ȯ(�Ͻ�������ȯ, implicit conversion, �����ʿ��� ū������, promotion)
//			4+89.5 ==> double, ���� + ���� ==> ����
//		2)��������ȯ(���������ȯ, explicit conversion, ū�ʿ��� ���������� ��ȯ, demotion)
//			(int)89.5 ==> 89
//	2. Reference Type
//		1)�ڵ�����ȯ(�Ͻ�������ȯ, implicit conversion, promotion, �ڽ��ʿ��� �θ������� ��ȯ, cast up)
//		2)��������ȯ(���������ȯ, explicit conversion, demotion, �θ��ʿ��� �ڽ������� ��ȯ, downward cast)

public class ObjectConversion {

	public static void main(String[] args) {
//		Test test = new Test();
//		Demo demo = new Demo();
//		//test = demo; // �ڵ� ����ȯ // �ڽ��� �θ�� �ڵ�,���� ����ȯ ����.
//		if(test instanceof Demo) // instanceof �����ڸ� ����Ͽ� ����ȯ�� �������� �Ұ������� ��������Ѵ�. �Ǵ� ��� true return
//		demo = (Demo)test; // �θ� �ڽ����� ��������ȯ�� �ɶ��� �ְ� �ȵ� ���� �ִ�.
//		else System.out.println("No");
		
		Object obj; // �θ��� ����
		obj = new String(); // �ڽ� ����, obj = str
		double avg = 4;
	}

}
class Test{
	
}
class Demo extends Test{
	
}