import ru.courses.geometry.Point;
import ru.courses.geometry.PolyLine;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(3, 4);

        PolyLine p1 = new PolyLine(a, b, c);
        PolyLine p2 = new PolyLine(new Point(0, 0), new Point(3, 0), new Point(3, 4));

        System.out.println("Длина p1 = " + p1.length());
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
    }
}