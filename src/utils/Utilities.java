package utils;

import java.util.Arrays;

public class Utilities {

    public static void swapper(int[] givenArray, int i, int j) {
       /*  if (i == j) {
            return;
        } */

        int temp = givenArray[i];
        givenArray[i] = givenArray[j];
        givenArray[j] = temp;
    }

    public static int[] getGeneratedIntArray(int sizeOfTheArray) {
        final int[] arrayToReturn = new int[sizeOfTheArray];

        for (int i = 0; i < sizeOfTheArray; i++) {
            arrayToReturn[i] = (int) (Math.round(Math.random() * 100 - 10));
        }

        return arrayToReturn;
    }

    public static void printArray(int[] array) {
        if (array == null) {
            return;
        }
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
    }
}