package ua.kiev.unicyb;

import java.util.HashMap;
import java.util.Map;

public class Point {
	private int x;

	private int y;

	private Map<Point, Integer> distancesToPoints = new HashMap<>();

	public Point() {
	}

	public Point(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Map<Point, Integer> getDistancesToPoints() {
		return distancesToPoints;
	}

	public void setDistancesToPoints(Map<Point, Integer> distancesToPoints) {
		this.distancesToPoints = distancesToPoints;
	}
}
