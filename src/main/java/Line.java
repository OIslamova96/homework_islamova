
public class Line implements Measurable {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentException("Both points for a Line must not be null.");
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public double getLength() {
        return p1.distanceTo(p2);
    }

    @Override
    public String toString() {
        return "Line[" + p1 + "-" + p2 + "]";
    }
}