package Exercises;

public class EX14SumOddRange {
    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sumOfTheOddNumbers = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfTheOddNumbers = sumOfTheOddNumbers + i;
                }
            }
            return sumOfTheOddNumbers;
        } else {
            return -1;
        }
    }
}
