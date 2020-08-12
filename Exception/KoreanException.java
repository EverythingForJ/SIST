// 사용자 정의 예외 만들기

// Checked Exception
public class KoreanException extends Exception{ // 1.excpetion의 자식클래스가 된다. checked exception이 된다.
	
	public KoreanException(String message) { // 2. 생성자를 통해 예외메세지를 보내준다.
		super(message);
	}
}

//Unchecked Exception
class EnglishException extends RuntimeException { // 런타임 자식이라 try&catch 필수는 아님
	public EnglishException(String message) {
		super(message);
	}
}
