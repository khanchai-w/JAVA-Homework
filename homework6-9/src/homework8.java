
public class homework8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 8-1
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int row = 0; row < twoD_Array.length; row++) {
			for (int element = 0; element < twoD_Array[row].length; element++) {
				System.out.println(twoD_Array[row][element]);
			}
		}

		// 8-2
		int[][] twoD_Array2 = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		int sum = 0;
		for (int[] row : twoD_Array2) {
				sum += row[row.length-1];
				//System.out.println(row[row.length-1]);			
		}
		System.out.println("sum = "+ sum);

	}

}
