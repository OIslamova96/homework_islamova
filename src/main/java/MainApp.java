public class MainApp {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(5, 8);
        Point p3 = new Point(10, 11);
        Point p4 = new Point(15, 19);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        Line line3 = new Line(p2, p3);

        System.out.println("--- Исходное состояние объектов ---");
        System.out.println("Линия 1:\n" + line1);
        System.out.println("Линия 2:\n" + line2);
        System.out.println("Линия 3:\n" + line3);
        System.out.println("----------------------------------\n");

        System.out.println("Текстовое представление Линии 3 (до изменения):");
        System.out.println(line3);
        System.out.println();

        line3.getStart().setX(7);
        line3.getStart().setY(10);
        line3.getEnd().setX(12);
        line3.getEnd().setY(15);
        System.out.println("Координаты изменены.\n");

        System.out.println("Текстовое представление Линии 3 (после изменения):");
        System.out.println(line3);
        System.out.println();

        System.out.println("--- Проверка изменений в других линиях ---");
        System.out.println("Линия 1 (после изменения p2):\n" + line1);
        System.out.println("Линия 2 (после изменения p3):\n" + line2);
        System.out.println("------------------------------------------\n");

        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.printf("Суммарная длина всех трех линий: %.2f\n", totalLength);
    }
}

