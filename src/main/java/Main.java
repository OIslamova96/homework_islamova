public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f_five_halves = new Fraction(5, 2);
        Fraction f_seven_thirds = new Fraction(7, 3);
        Fraction f_neg_10_3 = new Fraction(-10, 3);
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f_five_halves: " + f_five_halves);
        System.out.println("f_seven_thirds: " + f_seven_thirds);
        System.out.println("f_neg_10_3: " + f_neg_10_3);


        System.out.println("\n--- Проверка методов Number ---");
        System.out.println("f1.intValue() (1/3): " + f1.intValue());
        System.out.println("f1.longValue() (1/3): " + f1.longValue());
        System.out.println("f1.floatValue() (1/3): " + f1.floatValue());
        System.out.println("f1.doubleValue() (1/3): " + f1.doubleValue());

        System.out.println("\nf_five_halves.intValue() (5/2): " + f_five_halves.intValue());
        System.out.println("f_five_halves.doubleValue() (5/2): " + f_five_halves.doubleValue());

        System.out.println("\nf_seven_thirds.intValue() (7/3): " + f_seven_thirds.intValue());
        System.out.println("f_seven_thirds.longValue() (7/3): " + f_seven_thirds.longValue());
        System.out.println("f_seven_thirds.floatValue() (7/3): " + f_seven_thirds.floatValue());
        System.out.println("f_seven_thirds.doubleValue() (7/3): " + f_seven_thirds.doubleValue());

        System.out.println("\nf_neg_10_3.intValue() (-10/3): " + f_neg_10_3.intValue());
        System.out.println("f_neg_10_3.doubleValue() (-10/3): " + f_neg_10_3.doubleValue());

        System.out.println("\n--- Проверка полиморфизма с Number ---");
        Number[] numbers = new Number[3];
        numbers[0] = f1;
        numbers[1] = f_five_halves;
        numbers[2] = Integer.valueOf(10);

        for (Number num : numbers) {
            System.out.println("Число: " + num + ", как double: " + num.doubleValue());
        }
    }
}