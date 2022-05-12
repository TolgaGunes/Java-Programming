package quiz;

public class test2 {

    public static void main(String[] args) {

        pause1();
      //  pause2();

    }

    public static void pause1(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void pause2() throws InterruptedException {
        Thread.sleep(3000);
    }

}
/*
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(19);

    }

 */