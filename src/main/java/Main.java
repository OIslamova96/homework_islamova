public class Main {
    public static void main(String[] args) {
        // Создаем необходимые объекты Fraction
        Fraction f_1_2 = new Fraction(1, 2);
        Fraction f_2_3 = new Fraction(2, 3);
        Fraction f_3_4 = new Fraction(3, 4);
        Fraction f_1_5 = new Fraction(1, 5);
        Fraction f_3_5 = new Fraction(3, 5);
        Fraction f_1_10 = new Fraction(1, 10);
        Fraction f_3_10 = new Fraction(3, 10);
        Fraction f_neg_1_2 = new Fraction(-1, 2);

        System.out.println("--- Выполнение сложений ---");

        double sum1 = NumberUtils.sumAll(f_1_2, f_2_3, f_3_4);
        System.out.printf("1/2 + 2/3 + 3/4 = %.4f%n", sum1);

        double sum2 = NumberUtils.sumAll(f_1_5, f_3_5, f_1_10, f_3_10);
        System.out.printf("1/5 + 3/5 + 1/10 + 3/10 = %.4f%n", sum2);

        double sum3 = NumberUtils.sumAll(
                Integer.valueOf(5),
                f_1_2,
                f_neg_1_2,
                Double.valueOf(3.0),
                Long.valueOf(10)
        );
        System.out.printf("5 + 1/2 + (-1/2) + 3.0 + 10L = %.4f%n", sum3);
    }
}