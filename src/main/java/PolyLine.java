import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        this.points = new ArrayList<>();
    }

    public PolyLine(Point... initialPoints) {
        this();
        if (initialPoints != null) {
            this.points.addAll(Arrays.asList(initialPoints));
        }
    }

    public void addPoint(Point point) {
        if (point != null) {
            this.points.add(point);
        }
    }

    @Override
    public String toString() {
        if (points.isEmpty()) {
            return "Линия []";
        }
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (Point p : points) {
            sj.add(p.toString());
        }
        return "Ломаная " + sj.toString();
    }

    public Line[] getLines() {
        if (points.size() < 2) {
            return new Line[0];
        }
        Line[] lines = new Line[points.size() - 1];
        for (int i = 0; i < points.size() - 1; i++) {
            lines[i] = new Line(points.get(i), points.get(i + 1));
        }
        return lines;
    }

    public double getLength() {
        double totalLength = 0;
        Line[] segments = getLines();
        for (Line line : segments) {
            totalLength += line.getLength();
        }
        return totalLength;
    }
}