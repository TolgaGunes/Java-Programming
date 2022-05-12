package day43_Abstraction.car;

public class Tesla extends Car {

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autoPilot() {
        System.out.println(getBrand() + " " + getModel() + " has auto pilot feature");
    }

    /*
    public static void main(String[] args) {
        Tesla tesla1 = new Tesla("X","white",2022,30000);
        System.out.println(tesla1);
        tesla1.start();
    }
*/

}
