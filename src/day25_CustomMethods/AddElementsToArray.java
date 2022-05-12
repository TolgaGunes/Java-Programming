package day25_CustomMethods;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5); // {1,2,3,4,5}
        System.out.println(Arrays.toString(arr));

        char[] arr2 = {'a', 'b', 'c'};
        arr2 = addChar(arr2, 'k');
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = {"Kamil", "Koc", "Corc"};
        arr3 = addString(arr3, "leo");
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element; // or result[result.length-1] = element :> element need to be assigned to the last Index
        return result;
    }

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

}
