package quiz;

import day37_Inheritance.phoneTask.Phone;
import day40_FinalKeyword.Animal;

class caller extends Phone {

    public caller(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    private void init() {
        System.out.println("initialized");

    }

    private void start() {
        init();
        System.out.println("Started");
    }

    public class TestCall {
    }


   /* public static void main(String[] args) {
        Caller C = new Caller();
        C.start();
        C.init();


    */
    }

