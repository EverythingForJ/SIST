/*
* 7. interface끼리의 상속에서도 extends를 사용하며, 다중상속이 가능하다.
*/

public interface Father extends GrandFather, GrandMother {
	double PI = 3.141596;
	void father();
}
