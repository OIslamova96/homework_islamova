public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(0, 4);

        System.out.println("--- Обычная ломаная ---");
        PolyLine polyLine = new PolyLine(p1, p2, p3, p4);
        System.out.println(polyLine);
        System.out.println("Длина обычной ломаной: " + polyLine.getLength());

        System.out.println("\n--- Замкнутая ломаная ---");
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(p1, p2, p3, p4);
        System.out.println(closedPolyLine);
        System.out.println("Длина замкнутой ломаной: " + closedPolyLine.getLength());

        System.out.println("\n--- Замкнутая ломаная (2 точки) ---");
        ClosedPolyLine twoPointClosed = new ClosedPolyLine(p1, p2);
        System.out.println(twoPointClosed);
        System.out.println("Длина: " + twoPointClosed.getLength());
    }
}