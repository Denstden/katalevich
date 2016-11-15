package ua.kiev.unicyb;

import java.io.FileNotFoundException;
import java.util.List;

import javafx.util.Pair;

/**
 * @Author Denys Storozhenko.
 */
public class Solver {

	public Point solve(String fileName) throws FileNotFoundException {
		Pair<Integer[][], List<Point>> parsedResult = Parser.parse(fileName);

		calculateDistances(parsedResult.getKey(), parsedResult.getValue());

	}

	private void calculateDistances(Integer[][] matrix, List<Point> centers) {
		for (Point point : centers) {
			fillDistancesForPoint(point, matrix);
		}
	}

	private void fillDistancesForPoint(Point center, Integer[][] matrix) {

		point.getDistancesToPoints().put(center, distance);
	}
}
