package myJavaPractices;



public class Test {

    public Test() {
        System.out.println("A");  // 4. adım
    }

    public Test(int a) {
        this(2.5);  // 2. adım
        System.out.println("B"); // 6. adım
    }

    public Test(double  c) {
        this();  //  3. adım
        System.out.println("C");// 5. adım
    }

    public static void main(String[] args) {  // main'den baslar. static sartları istisna
        Test obj = new Test(100);  // 1. adım
    }
}
