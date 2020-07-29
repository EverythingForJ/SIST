/*
작성자 : 김준환
작성목적 : 커맨드라인 통한 입력 받기
작성일지 : 29/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ArrayDemo16 {
	public static void main(String[] args) {
		if(args.length != 3){
			System.out.println("Invaild Option");
			System.exit(0); // 시스템 강제 종료
		}
		int num1 = Integer.parseInt(args[0]); // String으로 받기때문에 형변환해야함.
		char op = args[1].charAt(0); // Stirng에서 char로 바꿔줘야한다.
		// 또는 바로 스트링으로 받아서 사용하는 것도 가능하다. String op = args[1];하고 스위치 ""바꾸기
		int num2 = Integer.parseInt(args[2]);
		int result = 0;

		switch(op){
			case '+':
				result = num1 + num2; break;
			case '-':
				result = num1 - num2; break;
			case 'x':
				result = num1 * num2; break;
			case '/':
				result = num1 / num2; break;
			case '%':
				result = num1 % num2; break;
			default :
				System.out.println("Invails Operator.");
				System.exit(-1);
		}
		System.out.println("결과 : "+result);
	}
}