/*
작성자 : 김준환
작성목적 : Reference type 값복사에 대해 알아보기
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ReferenceCopyTest{
      public static void main(String [] args){
             Student chulsu = new Student();
			 chulsu.age = 24;
			 
		 	 Student younghee = new Student();
	  		 younghee.age = chulsu.age; 
			 // 주소 복사가 아닌 값복사임. int age를 int age에 복사했기때문에

             System.out.println("철수의 나이는 " + chulsu.age);
			 System.out.println("영희의 나이는 " + younghee.age);
             System.out.println("변환 후");
             chulsu.age = 34;

             System.out.println("철수의 나이는 " + chulsu.age);
			 System.out.println("영희의 나이는 " + younghee.age);
			// 영향을 주지않는다.
			
	}
}

class Student{
      int age;
}