import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolyLine implements Measurable {
    protected final List<Point> points;

    public PolyLine() {
        this.points = new ArrayList<>();
    }

    public PolyLine(Point... initialPoints) {
        this();
        if (initialPoints != null) {
            for (Point p : initialPoints) {
                if (p != null) {
                    this.points.add(p);
                }
            }
        }
    }

    public PolyLine(List<Point> initialPoints) {
        this();
        if (initialPoints != null) {
            for (Point p : initialPoints) {
                if (p != null) {
                    this.points.add(p);
                }
            }
        }
    }

    public void addPoint(Point p) {
        if (p != null) {
            this.points.add(p);
        }
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

    @Override
    public double getLength() {
        double totalLength = 0;
        for (Line line : getLines()) {
            totalLength += line.getLength();
        }
        return totalLength;
    }

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

    @Override
    public String toString() {
        if (points.isEmpty()) {
            return "Ломаная []";
        }
        StringBuilder sb = new StringBuilder("Ломаная [");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}