package Exercises.EX42MinimumElement;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        return number;
    }

    private static int[] readElements(int n){
        int[] array =  new int[n];
        Scanner scanner =  new Scanner(System.in);
        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            array[i] = a;
        }
        return array;
    }

    private static int findMin(int[] array){
        int minimumValue = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] < minimumValue){
                minimumValue = array[i];
            }
        }
        return minimumValue;
    }
}

