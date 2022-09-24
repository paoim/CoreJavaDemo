package com.pao.challenge.array;

/**
 * Input:  {{1,    2,   3,   4},
 *          {5,    6,   7,   8},
 *          {9,   10,  11,  12},
 *          {13,  14,  15,  16 }}
* Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
* 
* Input: {{1,   2,   3,   4,  5,   6},
*         {7,   8,   9,  10,  11,  12},
*         {13,  14,  15, 16,  17,  18}}
* Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
 *
 */
public class SpiralMatrixDemo {

	private static String getSpiralMatrixWithSimpleApproach(int a[][]) {
		if (null == a || 0 == a.length) return "";

		int startRow = 0;
		int endRow = a.length;
		int startColumn = 0;
		int endColumn = a[0].length;
		int i; //iterator

		StringBuilder sb = new StringBuilder();

		while (startRow < endRow && startColumn < endColumn) {

			// Print the first row from the remaining rows
			for (i = startColumn; i < endColumn; ++i) {
				sb.append(a[startRow][i] + " ");
			}
			startRow++;

			// Print the last column from the remaining columns
            for (i = startRow; i < endRow; ++i) {
                sb.append(a[i][endColumn - 1] + " ");
            }
            endColumn--;

            // Print the last row from the remaining rows
            if (startRow < endRow) {
                for (i = endColumn - 1; i >= startColumn; --i) {
                    sb.append(a[endRow - 1][i] + " ");
                }
                endRow--;
            }

            // Print the first column from the remaining columns
            if (startColumn < endColumn) {
                for (i = endRow - 1; i >= startRow; --i) {
                    sb.append(a[i][startColumn] + " ");
                }
                startColumn++;
            }
		}
		return sb.toString();
	}

	private static void testFirstCase() {
		int a[][] =  {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
		String result = getSpiralMatrixWithSimpleApproach(a);
		if ("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 ".equals(result)) {
			System.out.println(result);
		}
	}

	private static void testSecondCase() {
		int a[][] =  {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};
		String result = getSpiralMatrixWithSimpleApproach(a);
		if ("1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11 ".equals(result)) {
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		testFirstCase();
		testSecondCase();
	}
}
