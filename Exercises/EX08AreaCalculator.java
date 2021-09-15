package Exercises;

public class EX08AreaCalculator {

    public static double area (double radius) {

        if (radius<0) {
            return -1.0d;
        }

        double areaOfCircle = ((Math.PI * (radius*radius)));
        return areaOfCircle;

    }

    public static double area (double x, double y) {

        if ((x<0)||(y<0)){
            return -1.0d;
        }

        double areaOfSquare = x*y;
        return areaOfSquare;

    }
}
