package solutions;

public class EvenFibonacciNumbers {
    public static long calc() {
        long SEQUENCE_UP_TO = 4_000_000;

        long previousValue = 0;
        long fibonacciNumber = 1;
        long currentValue;

        long result = 0;

        do {
            currentValue = fibonacciNumber;
            fibonacciNumber = previousValue + fibonacciNumber;
            previousValue = currentValue;

            if (fibonacciNumber % 2 == 0 && fibonacciNumber <= SEQUENCE_UP_TO) {
                result += fibonacciNumber;
            }

        } while (fibonacciNumber <= SEQUENCE_UP_TO);

        return result;
    }
}
