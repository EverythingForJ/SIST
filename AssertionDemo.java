

public class AssertionDemo {
	public static void main(String[] args) {
		int i, sum =0;
		for(i=1;i<101;i++) {
			//sum+= i;
			sum = i;
		}
		
		// if(i>100)System.out.println("100번 반복 여부 확인할 것"); // 이건 유저도 같이 확인한다.
		
		// 기본적으로 assert는 체크안하도록 false로 지정되어있다. 실행할 때 -ea를 써야한다(cmd창 or runConfigurations -> vm arguments). 
		assert i > 100 : "100번 반복 여부 확인할 것"; // assert는 개발자만 테스트할 수 있도록 한다.
 		assert sum > 100 : "누적 검사 필요";
		System.out.println("sum = " + sum);
	}
}