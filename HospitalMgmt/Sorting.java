public class Sorting {
	private Patient [] array;
	private int count;

	public Sorting(Patient [] array, int count){
		this.array = array;
		this.count = count;
	}
	
	public void quickSort(int start, int end) {
		int low = start, high = end;
		Patient mid = this.array[(start + end) / 2];
		do {
			while(this.array[low].getNo() < mid.getNo()) low++;
			while(this.array[high].getNo() > mid.getNo()) high--;
			if(low <= high) {
				Patient temp = this.array[low];
				this.array[low] = this.array[high];
				this.array[high] = temp;
				low++;  high--;
			}
		}while(low <= high);
		if(start < high) quickSort(start, high);
		if(low < end) quickSort(low, end);
	}
}