package day25_CustomMethods;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
       int sum= sumOf2Numbers(3,5);

       int sum2 = sumOf3Numbers(10, 20, 30);

    }

    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }


}

/*
Method overloading: either number of parameters or data types should be different.
 */