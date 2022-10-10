package sectionNr5.Exercises;

public class LargestPrime {

    //TODO:
    // 1. Check the prime number
    // 2. Check if the number is divided by the prime number
    // 3. if it is then save that nr in the variable and continue searching to find bigger prime number,
    // until wanted number will be bigger than our arg number

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
//        int primeNumber = 0;
        for (i = 2; i <= number; i++) {
            if (i % 2 == 0) {
                int primeNumber = i;
            }

        }
    }
}
