package Exercises.EX43ReverseArray;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array){
        int reversedArray;
        String Array = Arrays.toString(array);
        System.out.print("Array = "+ Array);
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length - (i+1);j++){
                reversedArray = array[j];
                array[j] = array[j+1];
                array[j+1] = reversedArray;
            }
        }
        String stringArr = Arrays.toString(array);
        System.out.println("Reversed array = "+stringArr);
    }
}
