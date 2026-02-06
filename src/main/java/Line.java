package ru.courses.geometry;

import java.util.Objects;

public class Line implements Cloneable {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Points must not be null");
        }
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public Line clone() {
        return new Line(new Point(start.getX(), start.getY()),
                new Point(end.getX(), end.getY()));
    }

    @Override
    public String toString() {
        return "Line[" + start + " - " + end + "]";
    }
}