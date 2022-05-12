package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static{
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

      final double pi = 3.14; // final is to restrict user the change a constance variable
      // pi = 4.14; final variables can not be reassigned

      final String name;
        name = "Java";
       // name = "Wooden Spoon";

        System.out.println(name);
        System.out.println("---------------");

        FinalVariable obj = new FinalVariable("May/01");
      //  obj.birthDay = "June/01";//can not assign a new value to a final variable
        System.out.println(obj.birthDay);
        System.out.println("-------------");

        // FinalVariable.name = "Pyhton"; can not assign a final name
        System.out.println(FinalVariable.name); // statics can be call through the class name


    }








}
