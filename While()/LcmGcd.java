/*
작성자 : 김준환
작성목적 : LCM,GCD
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class LcmGcd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1,str2;
		int gcm=0, lcm=0, num1, num2;
		System.out.print("첫 번째 수 : "); // 숫자로 써도 글자로 들어온다. "32"
		str1 = scan.nextLine();
		System.out.print("두 번째 수 : "); // "24"
		str2 = scan.nextLine();
		
		num1 = Integer.parseInt(str1,10);
		num2 = Integer.parseInt(str2,10);
		
/*		
		A=aG, B=bG, G=8, L=4*3*8
		LCM = a*b*G
*/
		for(int i= 2; i<num1; i++){
			if(num1%i==0 && num2%i==0) gcm = i;
		}
		lcm = num1/gcm+num2/gcm*gcm;
		System.out.printf("%d와%d의 GCM은%d, LCM은 %d입니다.\n",num1,num2,gcm,lcm);
	}
}