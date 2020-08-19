import java.util.Vector;

class Calc {
private Vector<Patient> vector;
	
	Calc(Vector<Patient> vector){
		this.vector = vector;
	}
	// 진찰 부서 설정
	private void calcDepartment() {
		for(int i=0; i<this.vector.size(); i++) {
			String code = vector.get(i).getCode();
			if(code.equals("MI")) {
				vector.get(i).setDepartment("외과");
			}else if(code.equals("NI")) {
				vector.get(i).setDepartment("내과");
			}else if(code.equals("SI")) {
				vector.get(i).setDepartment("피부과");
			}else if(code.equals("TI")) {
				vector.get(i).setDepartment("소아과");
			}else if(code.equals("VI")) {
				vector.get(i).setDepartment("산부인과");
			}else if(code.equals("WI")) {
				vector.get(i).setDepartment("비뇨기과");
			}
		}
	}
	// 나이에 따른 진찰비 설정
	private void calcCheckFee() {
		for(int i=0; i<this.vector.size(); i++) {
			int age = vector.get(i).getAge();
			if(age<10) {
				vector.get(i).setCheckFee(7000);
			}else if(age>=10 && age<20) {
				vector.get(i).setCheckFee(5000);
			}else if(age>=20 && age<30) {
				vector.get(i).setCheckFee(8000);
			}else if(age>=30 && age<40) {
				vector.get(i).setCheckFee(7000);
			}else if(age>=40 && age<50) {
				vector.get(i).setCheckFee(4500);
			}else if(age>=50) {
				vector.get(i).setCheckFee(2300);
			}
		}
	}
	// 총 입원비 설정 ( 입원비*입원일수*할인비율 )
	private void calcAdmissionFee() {
		for(int i=0; i<this.vector.size(); i++) {
			int days = vector.get(i).getDays();
			if(days<10) {
				if(days<=3) {
					int admissionFee = 30000*days;
					vector.get(i).setAdmissionFee(admissionFee);
				}else if(days>3 && days<10){
					int admissionFee = 25000*days;
					vector.get(i).setAdmissionFee(admissionFee);
				}
			}else if(days>=10 && days<15) {
				int admissionFee = (int)(25000*days *0.85);
				vector.get(i).setAdmissionFee(admissionFee);
			}else if(days>=15 && days<20) {
				int admissionFee = (int)(25000*days*0.80);
				vector.get(i).setAdmissionFee(admissionFee);
			}else if(days>=20 && days<30) {
				int admissionFee = (int)(25000*days*0.77);
				vector.get(i).setAdmissionFee(admissionFee);
			}else if(days>=30 && days<100) {
				int admissionFee = (int)(25000*days*0.72);
				vector.get(i).setAdmissionFee(admissionFee);
			}else if(days>=100) {
				int admissionFee = (int)(25000*days*0.68);
				vector.get(i).setAdmissionFee(admissionFee);
			}
		}
	}
	// 총 비용(진료비) = 진찰비+입원비
	private void calcTotalFee() {
		for(int i=0; i<this.vector.size(); i++) {
			int total = vector.get(i).getCheckFee()+vector.get(i).getAdmissionFee();
			vector.get(i).setTotalFee(total);
		}
	}
	
	void calc() {
		this.calcAdmissionFee();
		this.calcCheckFee();
		this.calcDepartment();
		this.calcTotalFee();
	}
}
