import java.util.List;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine() {
        super();
    }

    public ClosedPolyLine(Point... initialPoints) {
        super(initialPoints);
    }

    public ClosedPolyLine(List<Point> initialPoints) {
        super(initialPoints);
    }

    @Override
    public double getLength() {
        double openLength = super.getLength();

        if (points.size() < 2) {
            return openLength;
        }

        Point firstPoint = points.get(0);
        Point lastPoint = points.get(points.size() - 1);

        Line closingSegment = new Line(lastPoint, firstPoint);
        double closingSegmentLength = closingSegment.getLength();

        return openLength + closingSegmentLength;
    }

    @Override
    public String toString() {
        return "Замкнутая " + super.toString();
    }
}