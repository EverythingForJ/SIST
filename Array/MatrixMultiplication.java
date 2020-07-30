/**
 * @author SIST4-20
 * @date 2020. 7. 30.
 * @objective Çà·Ä µ¡¼À°ú °ö¼À
 * @environment : Windows10 Pro, Open JDK 14.0.2, Eclipse 2020-06
 */

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},
						  {3,4}};
		int[][] arr2 = {{5,6},
						  {7,8}};
		int[][] pResult = new int[2][2];
		int[][] mResult = new int[2][2];
		
		
		// µ¡¼À
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				pResult[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		// Ãâ·Â
		for(int i=0; i<arr1.length;i++) {
			for(int j =0; j<arr1[i].length;j++) {
				System.out.print(pResult[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// °ö¼À
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++) {
				for(int k=0; k<mResult.length; k++) {
					mResult[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		
		
		// Ãâ·Â
		for(int i=0; i<arr1.length;i++) {
			for(int j =0; j<arr1[i].length;j++) {
				System.out.print(mResult[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
