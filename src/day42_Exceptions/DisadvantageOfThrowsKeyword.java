package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args)  {

        System.out.println("Hello");

        //    sleep(2.5); // throws  (here we called below sleep method which we creat in the same class)

        System.out.println("Hello world");

        System.out.println("-------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try & catch  (here we called method from MorningWorkout Class

        System.out.println("Cydeo");


    }


    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep( (long) (seconds * 1000) );

    }
}


/*
Disadvantages:
1- "throw" remains only the method where is created. We can not use it in other methods
 even they are in the same class.


 */