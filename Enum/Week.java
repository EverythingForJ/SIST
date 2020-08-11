

public enum Week {
	// 나열형은 나열형 상수를 가장 먼저 써야한다.
	SUN(0), MON(100), TUE(101), WED(1000), THU(1001), FRI(10000), SAT(50000); // 타입조차 생략
	////////////////////////////////////////////
	
	private int value;
	
	Week(int value) { // 생성자
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
