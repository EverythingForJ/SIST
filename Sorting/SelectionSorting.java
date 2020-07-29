import java.util.Arrays;

/*
작성자 : 김준환
작성목적 : 선택정렬
작성일지 : 29/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class SelectionSorting {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1); // 랜덤 생성
		}
		
		System.out.println("Befor Sorting");
		System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0; j<arr.length-1;j++) {
//				if(arr[j]<arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		} // bubble sorting // j와 j+1정렬
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1;j<arr.length; j++) {
				if(arr[i] < arr[j]) { // 내림차순
					int temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} // Selection Sorting // i와 j 정렬
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	}
}
