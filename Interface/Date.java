/*
* 3. 이종간의 상속에는 implements를 사용한다.
* 4. 부모 interface의 추상메소드를 재정의할 때에는 반드시 public 접근 지정자를 사용해야한다.
*/

public class Date implements Datable {
	
	private int date;
	
	@Override
	public void set(int date) {
		this.date = date;
	}

	@Override
	public int get() {
		return this.date;
	}
	
}
