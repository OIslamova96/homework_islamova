import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double getLength() {
        double deltaX = end.getX() - start.getX();
        double deltaY = end.getY() - start.getY();
        return sqrt(pow(deltaX, 2) + pow(deltaY, 2));
    }

    @Override
    public String toString() {
        return "Линия от " + start.toString() + "\nдо " + end.toString();
    }
}