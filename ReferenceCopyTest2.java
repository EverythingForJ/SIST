/*
작성자 : 김준환
작성목적 : Reference type 복사에 대해 알아보기 ( 예외인 String 알아보기 )
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ReferenceCopyTest2{
      public static void main(String [] args){
             String original = "Hello";
			 String copy = original;
			 System.out.printf("original = %s, copy = %s\n", original,copy);
			 original = "World"; // 이것은 값변경이 아닌 새로운 "World"의 주소로 바뀌는것
			 System.out.printf("original = %s, copy = %s\n", original,copy);

			 /*
				String은 참조형이지만 예외
				Strings are constant; 스트링은 상수다.
				their values cannot be changed after they are created.
			 */
	}
}