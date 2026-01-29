import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Point p0_0 = new Point(0, 0);
        Point p3_0 = new Point(3, 0);
        Point p3_4 = new Point(3, 4);
        Point p0_4 = new Point(0, 4);

        PolyLine regularPolyLine = new PolyLine(p0_0, p3_0, p3_4);
        System.out.println(regularPolyLine);
        System.out.printf("Длина обычной ломаной: %.2f%n", regularPolyLine.getLength());

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(p0_0, p3_0, p3_4, p0_4);
        System.out.println(closedPolyLine);
        System.out.printf("Длина замкнутой ломаной: %.2f%n", closedPolyLine.getLength());

        Line singleLine = new Line(p0_0, p3_0);
        System.out.println(singleLine);
        System.out.printf("Длина одной линии: %.2f%n", singleLine.getLength());


        System.out.println("\n--- Использование полиморфного метода ---");

        Measurable[] geometries = new Measurable[3];
        geometries[0] = regularPolyLine;
        geometries[1] = closedPolyLine;
        geometries[2] = singleLine;

        MeasurementProcessor.printLengths(geometries);

        List<Measurable> geometricObjects = new ArrayList<>();
        geometricObjects.add(regularPolyLine);
        geometricObjects.add(closedPolyLine);
        geometricObjects.add(singleLine);

        MeasurementProcessor.printLengths(geometricObjects);
    }
}