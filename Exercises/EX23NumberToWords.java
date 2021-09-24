package Exercises;

public class EX23NumberToWords {

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        else{
            int reverse = reverse(number);
            int count = getDigitCount(number);

            while(count > 0) {
                int lastDigit = reverse % 10;
                reverse = reverse / 10;
                count--;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println();
                }
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        if(number < 0) {
            number = -1 * number;

            while (number > 0) {
                int lastDigit = number % 10;
                reverse = lastDigit + reverse * 10;
                number /= 10;
            }
            return - reverse;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = lastDigit + reverse * 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        else if(number == 0){
            return 1;
        }
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }
}
