package day44_Abstraction;

public interface Playable {

    boolean isFriendly = true; // static & final by default

    /*
    public static void method1() {
        System.out.println(isFriendly); // if i can call isFriendly here, it means it is static. we can veryf like this way
    }

     */

    void play(); // abstract by default


}
