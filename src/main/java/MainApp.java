public class MainApp {
    public static void main(String[] args) {
        System.out.println("--- Создание ломаной и начальные расчеты ---");

        Point pA = new Point(1, 5);
        Point pB = new Point(2, 8);
        Point pC = new Point(5, 3);
        Point pD = new Point(8, 9);

        PolyLine polyLine = new PolyLine(pA, pB, pC, pD);
        System.out.println("Исходная ломаная: " + polyLine);
        System.out.println();


        double polyLineLength = polyLine.getLength();
        System.out.printf("Длина ломаной (PolyLine): %.2f\n", polyLineLength);
        System.out.println();

        Line[] lineSegments = polyLine.getLines();
        System.out.println("Линии, составляющие ломаную:");
        for (int i = 0; i < lineSegments.length; i++) {
            System.out.printf("  Сегмент %d: %s (Длина: %.2f)\n", i + 1, lineSegments[i].getStart().toString() + " -> " + lineSegments[i].getEnd().toString(), lineSegments[i].getLength());
        }
        System.out.println();

        double totalLinesLength = 0;
        for (Line line : lineSegments) {
            totalLinesLength += line.getLength();
        }
        System.out.printf("Суммарная длина массива Линий: %.2f\n", totalLinesLength);
        System.out.println();


        System.out.println("Сравнение длины ломаной и суммарной длины сегментов:");
        if (Math.abs(polyLineLength - totalLinesLength) < 0.0001) {
            System.out.println("Длины совпадают. Отлично!");
        } else {
            System.out.println("Длины не совпадают. Есть ошибка!");
        }
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- Изменение координат Точки {2;8} на {12;8} ---");
        System.out.println("Исходное состояние pB: " + pB);

        System.out.println("Изменяем координаты pB...");
        pB.setX(12);
        System.out.println("pB после изменения: " + pB);
        System.out.println();

        System.out.println("Ломаная после изменения pB: " + polyLine);
        System.out.printf("Новая длина ломаной: %.2f\n", polyLine.getLength());
        System.out.println();

        System.out.println("Проверяем изменения в соответствующих сегментах массива линий:");
        if (lineSegments.length >= 2) {
            System.out.println("  Первый сегмент (pA->pB) после изменения: " + lineSegments[0].getStart().toString() + " -> " + lineSegments[0].getEnd().toString());
            System.out.printf("  Его новая длина: %.2f\n", lineSegments[0].getLength());
            System.out.println("  Второй сегмент (pB->pC) после изменения: " + lineSegments[1].getStart().toString() + " -> " + lineSegments[1].getEnd().toString());
            System.out.printf("  Его новая длина: %.2f\n", lineSegments[1].getLength());
        } else {
            System.out.println("Недостаточно сегментов для демонстрации.");
        }
        System.out.println();

        double newTotalLinesLength = 0;
        for (Line line : lineSegments) {
            newTotalLinesLength += line.getLength();
        }
        System.out.printf("Новая суммарная длина массива Линий: %.2f\n", newTotalLinesLength);

        if (Math.abs(polyLine.getLength() - newTotalLinesLength) < 0.0001) {
            System.out.println("Длины ломаной и массива линий совпадают и после изменения. Задача решена верно!");
        } else {
            System.out.println("Длины не совпадают после изменения. Есть ошибка!");
        }
        System.out.println("--------------------------------------------------\n");
    }
}