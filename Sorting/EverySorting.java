/**
 * @author 김준환
 * @date 2020. 7. 30.
 * @objective 정렬
 * @environment : Windows10 Pro, Open JDK 14.0.2, Eclipse 2020-06
 */

public class EverySorting {
	//오름차순
	static void bubbleSort(int[] array) { // call by reference
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] =temp;
				}
			}
		}
	}	
	static void selectionSort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] =temp;
				}
			}
		}
	}	
	static void insertionSort(int[] array) { // 정렬이 어느정도 되어있으면 속도가 매우 빠르다.
		int i,j,tmp;
		for(i=1; i<array.length; i++) {
			tmp = array[i];
			for(j=i-1; j>=0&&array[j]>tmp; j--) {
					array[j+1] = array[j];
			}
			array[j+1] =tmp;
		}
	}
	static void quickSort(int[] array) {
		
	}
}
