/*
작성자 : 김준환
작성목적 : Reference type 복사에 대해 알아보기
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ReferenceCopyTest1{
      public static void main(String [] args){
             Student chulsu = new Student();
			 chulsu.age = 24;
			 
		 	 //Student younghee = new Student();
	  		 Student younghee = new Student();
			 younghee = chulsu; 
			 // 주소를 복사한 것. 값복사와는 차원이 다르다.

             System.out.println("철수의 나이는 " + chulsu.age);
			 System.out.println("영희의 나이는 " + younghee.age);
             System.out.println("변환 후");
            
			 chulsu.age = 34;
             System.out.println("철수의 나이는 " + chulsu.age);
			 System.out.println("영희의 나이는 " + younghee.age);
			// 철수의 변경에 영희도 영향을 받는다.
			
			younghee.age = 44;
             System.out.println("철수의 나이는 " + chulsu.age);
			 System.out.println("영희의 나이는 " + younghee.age);
			// 영희의 변경에 철수도 영향을 받는다.
			
			/*
			1. 대상 : 참조형
			2. 연결되어있다.
			*/
	}
}