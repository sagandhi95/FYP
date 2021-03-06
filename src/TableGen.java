import java.util.Random;

public class TableGen {
	public static void main(String[] args) {
		int matrix[][] = new int[16][16];

		Random r = new Random();
		int Low = 1;
		int High = 10;

		// Generate Random matrix.
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j++) {

				int Result = r.nextInt(High - Low) + Low;
				matrix[i][j] = Result;
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		// Shift row wise
		for (int i = 0; i < 16; i++) {
			rowshiftRight(i, matrix);
		}
		System.out.println();

		// Print matrix
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		// Combining 2 elements of matrix.
		int combined_array[] = new int[128];
		int k = 0;
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j += 2) {
				combined_array[k] = matrix[i][j] * 10 + matrix[i][j + 1];
				k++;
			}
		}
		System.out.println();
		for (int i = 0; i < 128; i++)
			System.out.print(combined_array[i] + " ");

	}

	public static void rowshiftRight(int i, int[][] array) {
		int m = array[i].length;
		int temp = array[i][m - 1];
		for (int k = m - 1; k >= 1; k--) {
			array[i][k] = array[i][k - 1];
		}
		array[i][0] = temp;
	}
}
