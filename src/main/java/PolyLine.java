package ru.courses.geometry;

import java.util.Arrays;
import java.util.Objects;

public class PolyLine {

    private final Point[] points;

    public PolyLine(Point... points) {
        if (points == null) {
            this.points = new Point[0];
        } else {

            this.points = new Point[points.length];
            System.arraycopy(points, 0, this.points, 0, points.length);
        }
    }

    public double length() {
        if (points.length < 2) return 0.0;
        double sum = 0.0;
        for (int i = 0; i < points.length - 1; i++) {
            Point p1 = points[i];
            Point p2 = points[i + 1];
            if (p1 == null || p2 == null) continue;
            double dx = p2.getX() - p1.getX();
            double dy = p2.getY() - p1.getY();
            sum += Math.hypot(dx, dy);
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolyLine)) return false;
        PolyLine other = (PolyLine) o;
        if (this.points.length != other.points.length) return false;

        for (int i = 0; i < this.points.length; i++) {
            Point a = this.points[i];
            Point b = other.points[i];
            if (a == null && b == null) continue;
            if (a == null || b == null) return false;
            if (!a.equals(b)) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    public Point[] getPoints() {
        Point[] copy = new Point[this.points.length];
        System.arraycopy(this.points, 0, copy, 0, this.points.length);
        return copy;
    }

    @Override
    public String toString() {
        return "PolyLine" + Arrays.toString(points);
    }
}