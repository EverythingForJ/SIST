

public class ConstructorDemo1 {
	public static void main(String[] args) {
		Calender today = new Calender();
		System.out.println("year = "+today.year);
		Calender nextYear = new Calender(2021, 8, 4);
		System.out.println("year = "+nextYear.year);
	}
}

class Calender{
	int year, month, day;
	public Calender() { // default constructor
		this.year = 2020;
		this.month = 8;
		this.day = 4;
	}
	public Calender(int year, int month, int day) { // overloading
		this.year = year; this.month = month; this.day = day;
	}
}