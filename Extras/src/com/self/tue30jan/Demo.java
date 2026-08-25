package com.self.tue30jan;
import java.util.Scanner;

public class Demo {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the dimensions of the matrix
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		scanner.nextLine();  // Consume the newline character

		// Create the matrix to store the input data
		String[][] dataMatrix = new String[rows][cols];

		// Read the data for each row of the matrix
		for (int i = 0; i < rows; i++) {
			String[] rowValues = scanner.nextLine().split(" ");
			for (int j = 0; j < cols; j++) {
				dataMatrix[i][j] = rowValues[j];
			}
		}

		// Transpose and modify the data matrix
		String[][] transposed = transposeAndModifyData(dataMatrix);

		// Output the transposed and modified matrix
		printMatrix(transposed);
	}

	public static String[][] transposeAndModifyData(String[][] dataMatrix) {
		int rows = dataMatrix.length;
		int cols = dataMatrix[0].length;

		// Transpose the matrix
		String[][] transposedMatrix = new String[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transposedMatrix[j][i] = dataMatrix[i][j];
			}
		}

		// Modify the numeric elements by incrementing by 1
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.println(transposedMatrix[i][j]);
				// Start from 1 to skip the city names in the first column
				if (isNumeric(transposedMatrix[i][j])) {
					transposedMatrix[i][j] = modifyElement(transposedMatrix[i][j]);
					System.out.println(transposedMatrix[i][j]);
				}
			}
		}

		return transposedMatrix;
	}

	private static boolean isNumeric(String str) {
		return str.matches("\\d*");
	}

	private static String modifyElement(String element) {
		if (element.contains("M")) {
			double numericValue = Double.parseDouble(element.replace("M", ""));
			numericValue += 1;
			return String.format("%.1fM", numericValue);
		} else {
			int numericValue = Integer.parseInt(element);
			numericValue += 1;
			return Integer.toString(numericValue);
		}
	}

	private static void printMatrix(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

