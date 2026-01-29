public class NumberUtils {

    public static double sumAll(Number... numbers) {
        double totalSum = 0.0;
        if (numbers == null) {
            return totalSum;
        }

        for (Number number : numbers) {
            if (number != null) {
                totalSum += number.doubleValue();
            }
        }
        return totalSum;
    }
}
