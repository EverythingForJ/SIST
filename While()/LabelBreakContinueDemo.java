/*
�ۼ��� : ����ȯ
�ۼ����� : Label Break
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class LabelBreakContinueDemo{
	public static void main(String[] args) {
		// for���� Loop1�̶�� �̸��� �ٿ���.
		outer : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5)
//						break outer;
						break;
//						continue outer;
//						continue;
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();
		} 
	}
}