/*
 * 1. interface에는 public, static, final이 생략된 상수만 가질 수 있다.
 * 2. 모든 메소드는 public abstract이고 이를 생략할 수 있다.
*/

public interface Datable {
	int SUN = 0, MON = 1, TUE = 2, WED =3, THU =4, FRI = 5, SAT =6;
	void set(int date);
	int get();
}