package ua.kiev.unicyb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.util.Pair;

/**
 * @Author Denys Storozhenko.
 */
public class Parser {
	public static Pair<Integer[][], List<Point>> parse(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));

		int matrixSize = 0;
		if (scanner.hasNextInt()) {
			matrixSize = scanner.nextInt();
		}
		int countCenters = 0;
		if (scanner.hasNextInt()) {
			countCenters = scanner.nextInt();
		}
		List<Point> centers = parseCenters(countCenters, scanner);
		Integer[][] matrix = parseMatrix(matrixSize, scanner);

		return new Pair<>(matrix, centers);
	}

	private static List<Point> parseCenters(int countCenters, Scanner scanner) {
		List<Point> centers = new ArrayList<>();
		for (int i = 0; i < countCenters; i++) {
			Integer x = null;
			Integer y = null;
			if (scanner.hasNextInt()) {
				x = scanner.nextInt();
			}
			if (scanner.hasNextInt()) {
				y = scanner.nextInt();
			}
			if (x != null && y != null) {
				centers.add(new Point(x, y));
			}
		}
		return centers;
	}

	private static Integer[][] parseMatrix(int matrixSize, Scanner scanner) {
		Integer[][] resultMatrix = new Integer[matrixSize][matrixSize];
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				if (scanner.hasNextInt()) {
					resultMatrix[i][j] = scanner.nextInt();
				}
			}
		}
		return resultMatrix;
	}

}
