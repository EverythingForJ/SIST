// 1. 동일 폴더(패키지)에서 찾는다.

// 2. classpath에서 찾는다.

// 3. JRE System library에서 찾는다.
//	1)jdk 1.8까지는 %JAVA_HOME%/lib/ext folder에 갖다 놓을것
//	2)jdk 1.9 이후는 %JAVA_HOME%/lib에 갖다 놓는다.

// 4. Reference library에서 찾는다.

// import kr.co.sist.libs.*; // 첫번째 방법
import kr.co.sist.libs.Student; // 두번째 방법


public class Main extends Student {
	public static void main(String[] args) {
		//Student chulsu = new Student();
		// kr.co.sist.libs.Student chulsu = new kr.co.sist.libs.Student(); // 3번째 방법 FQN(Fully Qualified Name, 전체 경로)방법
		//chulsu.
		Main m = new Main();
//		m.avg;
	}
}
