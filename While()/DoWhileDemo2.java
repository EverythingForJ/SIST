/*
�ۼ��� : ����ȯ
�ۼ����� : doWhile
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class DoWhileDemo2 {
	public static void main(String[] args) {
		for(int i = 1; i<6; i++){
			int j =1; // �ʱ�ġ
			do{
				if(i==j){
					System.out.printf("%3d",i);
				}else{
					System.out.printf("%3d",0);
				}
				j++;
			}while(j<6);
			System.out.println();
		}
	}
}