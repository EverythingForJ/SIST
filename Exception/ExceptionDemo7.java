import java.util.Scanner;

public class ExceptionDemo7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kor;
		do {
			System.out.print("국어 점수 : ");
			try {
				kor = scan.nextInt();
				if(check(kor)) break;
				else throw new KoreanException("잘못된 국어점수입니다. \n확인 후 다시 입력해주세요");
			}catch(KoreanException e) {
				System.out.println(e.getMessage());
			}
		}while(true);
	}
	static boolean check(int jumsu) {
		if(jumsu < 0 || jumsu > 100) return false;
		else return true;
	}
	
}
