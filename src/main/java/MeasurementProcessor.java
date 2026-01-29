import java.util.List;

public class MeasurementProcessor {

    public static void printLengths(Measurable[] measurables) {
        if (measurables == null || measurables.length == 0) {
            System.out.println("Нет объектов для измерения.");
            return;
        }

        System.out.println("--- Результаты измерения объектов ---");
        for (int i = 0; i < measurables.length; i++) {
            Measurable m = measurables[i];
            if (m != null) {
                System.out.printf("Объект %d (%s): Длина = %.2f%n", i + 1, m.getClass().getSimpleName(), m.getLength());
            } else {
                System.out.printf("Объект %d: null%n", i + 1);
            }
        }
        System.out.println("------------------------------------");
    }

    public static void printLengths(List<Measurable> measurables) {
        if (measurables == null || measurables.isEmpty()) {
            System.out.println("Нет объектов для измерения.");
            return;
        }

        System.out.println("--- Результаты измерения объектов ---");
        int i = 0;
        for (Measurable m : measurables) {
            if (m != null) {
                System.out.printf("Объект %d (%s): Длина = %.2f%n", ++i, m.getClass().getSimpleName(), m.getLength());
            } else {
                System.out.printf("Объект %d: null%n", ++i);
            }
        }
        System.out.println("------------------------------------");
    }
}
