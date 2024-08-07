package solutions;

public class MultipleOf3Or5 {
    public static int calc() {
        int SEQUENCE_UP_TO = 1000;

        int result = 0;
        for (int i = 1; i < SEQUENCE_UP_TO; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }

        return result;
    }
}
