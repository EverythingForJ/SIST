// ����� ���� ���� �����

// Checked Exception
public class KoreanException extends Exception{ // 1.excpetion�� �ڽ�Ŭ������ �ȴ�. checked exception�� �ȴ�.
	
	public KoreanException(String message) { // 2. �����ڸ� ���� ���ܸ޼����� �����ش�.
		super(message);
	}
}

//Unchecked Exception
class EnglishException extends RuntimeException { // ��Ÿ�� �ڽ��̶� try&catch �ʼ��� �ƴ�
	public EnglishException(String message) {
		super(message);
	}
}
