package Exercises;

public class EX17EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sumEvenDigits = 0;
        if (number < 0)
            return -1;

        while (number > 0) {
            int evenDigits = number % 10;
            if (evenDigits % 2 == 0 )
                sumEvenDigits += evenDigits;
            number /= 10;
        }
        return sumEvenDigits;
    }
}
