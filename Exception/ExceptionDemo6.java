

public class ExceptionDemo6 {
	public static void main(String[] args) {
		Test t = null;
		try{
			t = new Test(100,190);
		}catch(KoreanException | EnglishException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(t);
	}
}




class Test{
	private int kor, eng;

	public Test(int kor, int eng) throws KoreanException {
		if(kor<0||kor>100) throw new KoreanException("잘못된 국어 점수");
		if(eng<0||eng>100) throw new EnglishException("잘못된 영어 점수");
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "test [kor=" + kor + ", eng=" + eng + "]";
	}
		
}