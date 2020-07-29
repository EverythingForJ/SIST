import java.util.Arrays;

/*
작성자 : 김준환
작성목적 : 다차원 배열 응용
작성일지 : 29/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class MDArrayDemo3 {
	public static void main(String[] args) {
		String[] names = {"김지민","박지민","한지민"};
		int [][] array = {
								{56, 78, 90, 0},
								{100,99,98, 0},
								{77, 88, 99, 0}
								};
		// 총점
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length-1;j++) {
				array[i][3]+=array[i][j];
			}
		}
		// 출력
		for(int i=0; i<array.length;i++) {
			System.out.print(names[i] + "\t");
			for(int j =0; j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.printf("%.2f%n",array[i][3]/3.);
		}
	}
}