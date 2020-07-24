/*
작성자 : 김준환
작성목적 : while()
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
/*		Scanner scan = new Scanner(System.in);
		int max = 0, input;
		System.out.println("비교할 값들을 입력해주세요.(음수 입력시 결과 출력)");
		while((input = scan.nextInt())>=0){
			if(max<input) max = input;
		}
		System.out.printf("가장 큰 값은 %d입니다", max);
*/

/*		// 구구단
		int j=1;
		while (j<=9){
			int i=1;
			while(i<=9){
				System.out.printf("%d x %d = %-4d", j,i,j*i);
				i++;
			}
			System.out.println();
			j++;
		}
*/
		int i = 1,sum=0;
		while(sum<1_000_000){
			i++;
			sum = sum+i;
		}
		System.out.printf("%d를 더하고 백만을 초과하여 %d가 됐습니다. ", i, sum);
	}
}