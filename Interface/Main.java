// 1. ���� ����(��Ű��)���� ã�´�.

// 2. classpath���� ã�´�.

// 3. JRE System library���� ã�´�.
//	1)jdk 1.8������ %JAVA_HOME%/lib/ext folder�� ���� ������
//	2)jdk 1.9 ���Ĵ� %JAVA_HOME%/lib�� ���� ���´�.

// 4. Reference library���� ã�´�.

// import kr.co.sist.libs.*; // ù��° ���
import kr.co.sist.libs.Student; // �ι�° ���


public class Main extends Student {
	public static void main(String[] args) {
		//Student chulsu = new Student();
		// kr.co.sist.libs.Student chulsu = new kr.co.sist.libs.Student(); // 3��° ��� FQN(Fully Qualified Name, ��ü ���)���
		//chulsu.
		Main m = new Main();
//		m.avg;
	}
}
