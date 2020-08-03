

public class Sorting {
	static void insertionSort(Student[] array) {
		int i,j;
		Student temp;
		
		for(i=1;i<array.length; i++) {
			temp=array[i];
			// temp가 크면 내림차순
			for(j=i-1; j>=0 && array[j].getTot() < temp.getTot(); j--) {
				array[j+1] = array[j];
			}
			array[j+1] = temp;
		}
	}

}
