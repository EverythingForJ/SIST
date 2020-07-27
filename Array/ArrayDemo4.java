/*
작성자 : 김준환
작성목적 : 배열
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ArrayDemo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String y_n=null;
		do{
		System.out.print("Money : ");
		int price = scan.nextInt();
		int[] arr2 = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
/*		int[] arr = new int[10];		
		
		for(int i = 0; i<arr2.length; i++){
			arr[i] = price/arr2[i];
			price = price%arr2[i];
		}
		
		for(int i = 0; i<arr.length; i++){
			System.out.printf("%d원권 : %d장\n",arr2[i],arr[i]);
		}

		System.out.print("Again(y/n)?");
		String a = scan.nextLine();
		if(a.equals("y")){
		}
*/
		for(int i = 0; i<arr2.length; i++){
			System.out.println(arr2[i] + "원권 : "+price/arr2[i]);
			price = price%arr2[i];
		}

		System.out.print("Again(y/n)?");
		y_n = scan.next();
		}while(y_n.equals("y"));
	}
}