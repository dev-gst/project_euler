package solutions;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

    public static Long calc() {
        long NUMBER = 600_851_475_143L;
        long SQ_ROOT = (long) (Math.ceil(Math.sqrt(NUMBER))) ;

        List<Long> primes = new ArrayList<>();
        primes.add(2L);

        // Find and add to the list all primes up to the sqrt of the number
        for (long i = 2; i <= SQ_ROOT; i++) {
            if (isPrime(i, primes)) {
                primes.add(i);
            }
        }

        // Check the largest prime factor of the NUMBER
        // Starts from the last index of the list of primes to save time
        long largestPrimeFactor = -1;
        long tempFactor;
        int primesSize = primes.size();

        for (int i = 0; i < primesSize; i++) {
            tempFactor = primes.get(primesSize - 1 - i);
            if (NUMBER % tempFactor == 0) {
                largestPrimeFactor = tempFactor;
                break;
            }
        }

        return largestPrimeFactor;
    }

    private static boolean isPrime(long number, List<Long> primes) {
        for (Long prime : primes) {
            if (number % prime == 0) {
                return false;
            }
        }
        return true;
    }
}
