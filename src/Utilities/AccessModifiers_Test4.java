package Utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

     //   System.out.println(AccessModifiers_Test4.name1);// defaultt is not visible from outside the package
        System.out.println(AccessModifiers_Test4.name2); //protected is visible from outside the package, when it is called from subclass

    //    AccessModifiers_Test4.method1(); //default is not visible outside the package
        AccessModifiers_Test4.method2();



    }
}
