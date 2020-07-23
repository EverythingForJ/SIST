/*
작성자 : 김준환
작성목적 : switch
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("출생년도 : ");
		int year = scan.nextInt();

		int age = 2020-year+1;
		String animal;
		switch(year%12){
		case 0: animal = "원숭이"; break;
		case 1: animal = "닭"; break;
		case 2: animal = "개"; break;
		case 3: animal = "돼지"; break;
		case 4: animal = "쥐"; break;
		case 5: animal = "소"; break;
		case 6: animal = "호랑이"; break;
		case 7: animal = "토끼"; break;
		case 8: animal = "용"; break;
		case 9: animal = "뱀"; break;
		case 10: animal = "말"; break;
		default: animal = "양"; break;
		}

		System.out.println("---------------------------");
		System.out.printf("%s님은 %d살이고, %s띠입니다.", name, age, animal);
	}
}