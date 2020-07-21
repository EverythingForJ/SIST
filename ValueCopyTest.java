/*
작성자 : 김준환
작성목적 : Primitive type 값복사에 대해 알아보기
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ValueCopyTest{
      public static void main(String [] args){
/*
            int first, second;
            first = 7;
            second = first;
            System.out.println("first = " + first);
            System.out.println("second = " + second);

            System.out.println("값 변환 후");
            second = 10;
            System.out.println("first = " + first);
            System.out.println("second = " + second);        
			// 값을 직접 복사했기에 다른 대상에 영향을 주지않는다.
			// 원본과 카피본은 구별되어 있다.
*/
			double original = 173.6;
			double copy = original;
			System.out.printf("original = %.1f, copy = %.1f\n", original, copy);

			original = 190.4;
			System.out.printf("original = %.1f, copy = %.1f\n", original, copy);
		
			/*
			값복사
			1. 대상 : primitive type
			2. 동작 : 원본이 바뀐다고 카피본이 바뀌지 않는다. 즉,
					 	 원본과 카피본은 서로 다르다(서로 연결되어 있지 않다).
			*/
      }
}