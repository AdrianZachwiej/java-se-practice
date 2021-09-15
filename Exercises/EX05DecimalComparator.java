package Exercises;

public class EX05DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first,double second) {

        if (first <0 && second >0 || first >0 && second <0){
            return false;
        }

        double firstThousand = first*1000;
        double secondThousand = second*1000;

        int firstint = (int)firstThousand;
        int secondint = (int)secondThousand;

        if (firstint==secondint){
            return true;
        }

        return false;

    }
}
